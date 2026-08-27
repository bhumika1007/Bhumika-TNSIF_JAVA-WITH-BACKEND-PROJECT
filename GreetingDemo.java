package interfacedemo;

/*** Functional Interface
A functional interface is an interface that contains exactly one abstract method. 
It serves as the target type for Lambda Expressions and Method References in Java.

*/
@FunctionalInterface
public interface GreetingDemo {
	void greet();
	
	//void greet1();
}
