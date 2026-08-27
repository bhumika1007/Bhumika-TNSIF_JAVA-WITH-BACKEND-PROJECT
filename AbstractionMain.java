package abstractionday3;

//Rule 1 (No new Keyword): You cannot write new Student() because "Student" 
//is a general concept here. You can only create objects of specific student types like CSStudent or ArtsStudent.

//Rule 2 (Abstract Method): public abstract void study(); has no curly braces {}. 
//It forces every child class to write its own version of study().

//Rule 3 (Code Reuse): The markAttendance() method is written once in the parent class, 
//so all student subclasses reuse it without repeating code.

	// 1. Abstract Parent Class
	abstract class Student {
	    // Abstract method (no body)
	    abstract void study();

	    // Normal method
	    void markAttendance() {
	        System.out.println("Student is Present");
	    }
	}

	// 2. Child Class 1
	class CSStudent extends Student {
	    void study() {
	        System.out.println("Studying Java and Coding!");
	    }
	}

	// 3. Child Class 2
	class ArtsStudent extends Student {
	    void study() {
	        System.out.println("Studying History and Literature!");
	    }
	}
public class AbstractionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student s = new Student(); // ERROR: Cannot create an object of an abstract class!

        CSStudent rahul = new CSStudent();
        rahul.markAttendance(); // Output: Student is Present
        rahul.study();          // Output: Studying Java and Coding!

        ArtsStudent priya = new ArtsStudent();
        priya.markAttendance(); // Output: Student is Present
        priya.study();          // Output: Studying History and Literature!

	}

}
