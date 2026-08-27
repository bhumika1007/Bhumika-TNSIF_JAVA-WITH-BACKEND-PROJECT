package interfacedemo;

/***Interface: An interface is a blueprint of a class that defines what a class must do, 
but not how. It contains abstract methods (signatures without a body) 
that implementing classes are required to define.
*/

interface Fruits{
	
 void sweet() ; //declaration
 
 //void sour();
	
}

public class InterfaceExample implements Fruits{
	
	public void sweet() {
		System.out.println("The fruits are sweet!!!"); //implementation
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample obj1 = new InterfaceExample();
		obj1.sweet();
	}

}
