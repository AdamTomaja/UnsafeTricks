package pl.tomaja;

import pl.tomaja.common.UnsafeHelper;
import sun.misc.Unsafe;

/**
 * This example shows how it`s possible to modify the memory directly
 * 
 * @author atomaja
 */
@SuppressWarnings("restriction")
public class DirectMemoryAccess {

	private static final Unsafe unsafe = UnsafeHelper.get().getUnsafe();

	public static void main(String[] args) {
		// Allocate 4 bytes memory block for our integer
		final long ptr = unsafe.allocateMemory(4);

		// Write int to allocated memory
		unsafe.putInt(ptr, 512);

		int val = unsafe.getInt(ptr);
		System.out.println("Integer val: " + val);
	}
}
