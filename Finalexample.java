package nonaccessmodifiers;

public class Finalexample {

 int x = 100;
	
	int y = 300;
	
	void print() {
		System.out.println("Print the value of x: "+ x);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalexample fe = new Finalexample();
		fe.print();
	
		
		fe.x = 200; 
		
		fe.print();
		

	}

}
class Example extends Finalexample{
	void print() {
		
	}
}
