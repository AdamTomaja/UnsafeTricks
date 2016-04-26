package pl.tomaja;

import java.io.IOException;

/**
 * This example shows how to throw checked exceptions without using throws or catch
 * 
 * @author atomaja
 */
public class ThrowException {

	public static void main(String[] args) {
		throwException();
	}

	@SuppressWarnings("restriction")
	private static void throwException() {
		UnsafeHelper.get()
			.getUnsafe()
			.throwException(new IOException("This is my exception"));
	}
}
