package pl.tomaja;

/**
 * @author atomaja
 */
public class Person {

	private String name;
	private int age;
	private boolean constructorCalled;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
		constructorCalled = true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", constructorCalled=" + constructorCalled + "]";
	}
}
