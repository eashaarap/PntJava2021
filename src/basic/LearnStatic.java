package basic;

public class LearnStatic {
	
	// Declare variable: Declare dataType with variable name
	int age;
	// Declare variable and Assign value
	int pizzaPrice = 25;
	

	
	public static String stName="Easha"; // Static global variable
	
	String stAddress="New York"; // non static global variable
	
	static String stFatherName;
	String stMotherName;
	
	
	public static void tvDisplay() {
		System.out.println("TV Dispaly is UHD");
	}
	
	
	public void display() {
		System.out.println("Display is good");
	}
	
	public static void main(String[] args) {
		// semicolon we use to complete a statement ;
		
		// How can we call a static variable inside main method?
		// Static variable/method call by class name as that variable/method in class level.
		
		LearnStatic.stName="Kevin"; // ReAssign value
		LearnStatic.stName="Arafat";  
		System.out.println(LearnStatic.stName);
		LearnStatic.tvDisplay();
		LearnStatic.stFatherName="Bob William";
		System.out.println("Student Father name is "+LearnStatic.stFatherName);
		
		
		
		// How can we call a non static variable inside main method?
		// to call a non static variable / Method we need create Object then call by object name.
		
		
		// How to create a object?
		
		// className objectName = new constructorOfClass();
		
		LearnStatic obj = new LearnStatic();
		//obj.stAddress;
		System.out.println(obj.stAddress);
		obj.age=34;
		System.out.println(obj.age);
		obj.pizzaPrice=45;
		obj.pizzaPrice=55;
		System.out.println("Pizza Price "+obj.pizzaPrice);
		System.out.println(obj.stMotherName);
		obj.display();// call by objectName
		
		
		String stPhoneNumber="4654846466"; // Local variable
		
		
		
	}
	
	
	
	
	
	
	
	
}
