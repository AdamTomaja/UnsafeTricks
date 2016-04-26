package pl.tomaja.common.ui;

/**
 * @author atomaja
 */
public class UI {

	private static final UIProvider provider = new UIProvider();
	
	public static void showInformation(String title, Object information) {
		provider.showInformation(title, information);
	}
	
	public static void showInformation(Object information) {
		provider.showInformation(information);
	}
}
