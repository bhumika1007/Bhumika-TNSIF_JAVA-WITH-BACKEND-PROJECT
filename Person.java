package Accessmodifiers;

public class Person {

	// 1. PUBLIC: Accessible from ANY class in ANY package
	 public String name = "Alice";

	 // 2. PROTECTED: Accessible in the SAME package and by SUBCLASSES
	 protected int age = 30;

	 // 3. DEFAULT (Package-Private): Accessible ONLY within the SAME package
	 String city = "New York"; // No modifier keyword used

	 // 4. PRIVATE: Accessible ONLY within THIS class
	 private String socialSecurityNumber = "123-45-6789";

	 public void displayInfo() {
	     // All variables are accessible inside the class where they are defined
	     System.out.println("Name: " + name);
	     System.out.println("Age: " + age);
	     System.out.println("City: " + city);
	     System.out.println("SSN: " + socialSecurityNumber); // Works here!
	 }

}
