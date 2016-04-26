package pl.tomaja.common.ui;

/**
 * @author atomaja
 */
public class UIProvider {

	public void showInformation(String title, Object information) {
		System.out.format("%s: %s", title, information);
		System.out.println();
	}
	
	public void showInformation(Object information) {
		System.out.println(information);
	}
}
