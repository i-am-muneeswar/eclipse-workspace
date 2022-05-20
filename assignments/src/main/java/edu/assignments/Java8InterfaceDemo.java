package edu.assignments;
@FunctionalInterface
// "@" is Annotation
public interface Java8InterfaceDemo {
	// we cannot create method and body for abstract interface method until jdk 1.7
	// but the new feature of jdk 1.8 allows us to do it
	// from jdk 1.8 we can write method with body inside an abstract class by adding "default" specifier
	// another add-on is is we can also write static method
	// if it is normal method then it must be abstract
	// functional interface - interface with only one abstract method
	// we are using functional interface to achieve lambda function
	
	// select properties of folder and remove jre 1.5 in libraries
	
	default void add() {
		
	}
	
	static void sub() {
		
	}
	
	void mult();
	//void divide();
	//void modulo();
	
	

}
