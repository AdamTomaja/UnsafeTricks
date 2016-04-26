package pl.tomaja.common;

/**
 * @author atomaja
 */
public class Person {

	private final int pin;
	private final String name;
	private final int age;
	private final boolean constructorCalled;
	
	public Person(String name, int age, int pin) {
		this.name = name;
		this.age = age;
		this.pin = pin;
		
		constructorCalled = true;
	}

	public void tryPin(int pin) {
		if(this.pin != pin) {
			throw new RuntimeException("Invalid pin!");
		}
	}

	@Override
	public String toString() {
		return "Person [pin=" + pin + ", name=" + name + ", age=" + age + ", constructorCalled=" + constructorCalled
				+ "]";
	}
}
