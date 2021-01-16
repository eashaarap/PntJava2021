package constructor;

public class LearnConstructor {
	
	/*
	 * Constructor:
	 * 	- name should be same as class name
	 * 	- has no return type
	 * 	- can't be under main method
	 * 	- are used to initialize object
	 * 	- can create multiple constructors in a class just like we can create multiple objects in a class
	 */
	
	// AccessModifier className (){	}

	String stName;
	int stAge;
	String stAddress;
	double courseFee;
	String stPhoneNumber;
	
	public LearnConstructor() { 
	//Default Constructor: has no parameter
//		System.out.println("This is default constructor");
//		
//		
//		
//		int a = 10;
//		int b = 40;
//		int total = a + b;
//		System.out.println("Total is: " + total);
		
	}
	/*
	 * You can have two constructors with the same name but they must follow:
	 * a different Signature Pattern
	 * different Parameter(____________)
	 */
	

	//Single Parameterized Constructor
	public LearnConstructor(String name) {
		//Parameterized Constructor : has /parameters
		System.out.println("Student name is " + name);
		
	}	
	
	
	//Multi Parameterized Constructor
	public LearnConstructor(String name, int age) {
		
		System.out.println("Student name is:" + " "+ "And age is: " + age);
	}
	
	//
	public LearnConstructor(String name, String address) {
		this.stName = name;
		this.stAddress = address;
		System.out.println("Student name is: " + this.stName + " Address is: " + this.stAddress );
	}
	
	public LearnConstructor (String stAddress, String stName, String stPhoneNumber, int stAge, double courseFee ) {
		
		this.stAddress = stAddress;
		this.stName = stName;
		this.stPhoneNumber = stPhoneNumber;
		this.stAge = stAge;
		this.courseFee = courseFee;
		
		System.out.println("Student Name is: " + this.stName + "\nStudent Address is: "+ this.stAddress + " \nStudent Phone Number is: " + this.stPhoneNumber + " \nStudent age is: " + this.stAge + " \nStudent Course Fee is: "  + this.courseFee);
		
		
	}
	
	public LearnConstructor(int courseFee) {
		this.courseFee = courseFee;
		
		double courseFeeAfterDiscount = this.courseFee * .90;
		System.out.println("Course fee after discount: " + "$"+courseFeeAfterDiscount);
	}
	
	public static void main(String[] args) {
		// className objectName = new constructorOfClass ();
		
		LearnConstructor learn = new LearnConstructor();
		
		LearnConstructor student = new LearnConstructor("Easha"); // argument passing
		LearnConstructor monk = new LearnConstructor("Monkey");
		
		LearnConstructor newname = new LearnConstructor("John Doe", 50);
		
		LearnConstructor farha  = new LearnConstructor("Farha", "Jersey City, NJ");
		
		LearnConstructor ghania = new LearnConstructor("Hudson, NY", "Ghania", "7183349807", 25, 5000.99);
		
		LearnConstructor easha = new LearnConstructor(5000);
		
	}
	
	
	
	

}
