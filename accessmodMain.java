package Accessmodifiers;

public class accessmodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();

        System.out.println(p.name);   // Allowed (public)
        System.out.println(p.age);    // Allowed (protected, same package)
        System.out.println(p.city);   // Allowed (default, same package)
        
       // System.out.println(p.socialSecurityNumber); 
        //COMPILE ERROR: socialSecurityNumber has private access in Person
    }
	}


