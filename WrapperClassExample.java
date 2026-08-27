package wrapperclassDemo;

/***Wrapper Class
A wrapper class encapsulates a primitive data type or an underlying object into a Java object, 
allowing it to be treated as an object (e.g., converting int to Integer) 
or extending its functionality without altering its original code.
 */

public class WrapperClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive into object --> autoboxing 

		
				int x = 10;
				
				Integer y = Integer.valueOf(x);
				
				
				System.out.println(y);
				
				
				// object into primitive --> unboxing
				
				int z = y;
				
				System.out.println(z);

	}

}
