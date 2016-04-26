package pl.tomaja;

import pl.tomaja.common.Person;
import pl.tomaja.common.UI;
import pl.tomaja.common.UnsafeHelper;
import sun.misc.Unsafe;

/**
 * This example shows how to initialize class instance without calling the constructor
 * 
 * @author atomaja
 */
@SuppressWarnings("restriction")
public class AvoidingInitializationOfObject 
{
    public static void main( String[] args ) throws InstantiationException
    {
    	Unsafe unsafe = UnsafeHelper.get().getUnsafe();
    	
    	// Normal initialization:
    	Person adam = new Person("Adam", 20, 1024);
    	UI.showInformation("Safe person", adam);
    	
    	// This case will cause compilation error:
    	// Person mark = new Person();
    	
    	// Initializing without calling the constructor
    	// 'empty' object is initialized with name = null and age = 0
    	// It`s important: final fields was not initialized in constructor! 
    	Person empty = (Person) unsafe.allocateInstance(Person.class);
    	UI.showInformation("Unsafe person", empty);
    }
}
