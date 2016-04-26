package pl.tomaja;

import java.lang.reflect.Field;

import pl.tomaja.common.Person;
import pl.tomaja.common.UnsafeHelper;
import pl.tomaja.common.ui.UI;
import sun.misc.Unsafe;

/**
 * This example shows how to modify fields marked as final
 * 
 * @author atomaja
 */
@SuppressWarnings("restriction")
public class MemoryCorruption {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		// Get unsafe instance
		final Unsafe unsafe = UnsafeHelper.get().getUnsafe();

		// Create new person with some pin
		Person adam = new Person("Adam", 20, 1024);

		// This is going to fail
		tryAuthenticate(adam, 1000);
		
		// Corrupt int field in adam instance
		Field pinField = adam.getClass().getDeclaredField("pin");
		unsafe.putInt(adam, unsafe.objectFieldOffset(pinField), 1000);

		// Hacked!
		// Hacker is authenticated with his own pin
		// Important: pin field is marked as final! 
		tryAuthenticate(adam, 1000);
	}

	private static void tryAuthenticate(Person adam, int pin) {
		try {
			adam.tryPin(pin);
			UI.showInformation("Authenticated with pin", pin);
		} catch (Exception e) {	
			UI.showInformation("Unable to authenticate with pin", pin);
		}
	}
}
