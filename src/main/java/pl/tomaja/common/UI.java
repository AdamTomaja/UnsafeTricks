package pl.tomaja.common;

/**
 * @author atomaja
 */
public class UI {

	public static void showInformation(String title, Object information) {
		System.out.format("%s: %s", title, information);
		System.out.println();
	}
	
	public static void showInformation(Object information) {
		System.out.println(information);
	}
}
