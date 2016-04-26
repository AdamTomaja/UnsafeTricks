package pl.tomaja;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * @author atomaja
 */
@SuppressWarnings("restriction")
public class UnsafeHelper {

	private static UnsafeHelper INSTANCE = new UnsafeHelper();

	private UnsafeHelper() { }

	public Unsafe getUnsafe() {
		try {
			Field f = Unsafe.class.getDeclaredField("theUnsafe");
			f.setAccessible(true);
			return (Unsafe) f.get(null);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	public static UnsafeHelper get() {
		return INSTANCE;
	}
}
