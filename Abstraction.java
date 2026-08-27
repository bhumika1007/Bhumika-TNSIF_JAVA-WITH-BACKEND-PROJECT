package nonaccessmodifiers;

abstract class Shape_Example{
	
	abstract void draw(); //functionality or declaration

}

class Square extends Shape_Example{
	
	void draw() {
		System.out.println("Drawing a square");
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		s.draw();
		

	}

}
