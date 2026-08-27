package nonaccessmodifiers;

public class Staticexample {
	//static variable
	
		static int count;
		
		int variable; // instance variable
		
		//static block

		static {
			
			count = 15;
			
			//variable = 20;
			
			System.out.println("Showing the static variable count: "+count);
		}
		
		
		//static method
		static void display() {
			System.out.println("Displaying the static method with count: "+count);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Printing the main method");

		display();

	}

}
