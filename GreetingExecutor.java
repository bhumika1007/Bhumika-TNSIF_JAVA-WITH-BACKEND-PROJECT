package interfacedemo;
/**
 * LAMBDA FUNCTION: Short syntax used to implement a functional interface's single method concisely without creating an explicit class.
 */


public class GreetingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lambda expression
		
				GreetingDemo gd = () -> {
					System.out.println("Hi All! Welcome to the Java Session");
				};
				
				gd.greet();

	}

}
