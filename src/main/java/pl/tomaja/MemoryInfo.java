package pl.tomaja;

import pl.tomaja.common.UnsafeHelper;
import pl.tomaja.common.ui.UI;
import sun.misc.Unsafe;

/**
 * This example shows how to access low level memory informations
 * 
 * @author atomaja
 */
@SuppressWarnings("restriction")
public class MemoryInfo {

	private static final Unsafe unsafe = UnsafeHelper.get().getUnsafe();
	
	public static void main(String[] args) {
		UI.showInformation("Address size", unsafe.addressSize());
		UI.showInformation("Page size", unsafe.pageSize());
	}
}
