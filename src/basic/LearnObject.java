package basic;

public class LearnObject {

	// How to create a object?

	// className objectName = new constructorOfClass();

	int num1 = 34;
	int num2 = 45;

	public static void main(String[] args) {
		LearnObject learn = new LearnObject();

		int total = learn.num1 + learn.num2; // call by object name
		System.out.println("Total value is " + total);

		// Can we create multiple object of same class? yes
		LearnObject obj = new LearnObject();
		obj.num1 = 66;
		obj.num2 = 77;
		int output = obj.num1 * obj.num2;
		System.out.println("Output is " + output);

		// can we create another class object here? yes
		LearnDataType dataType = new LearnDataType();
		
		System.out.println(dataType.courseFee);
		dataType.isAvailable=false; // ReAssign value
		System.out.println(dataType.isAvailable);
		
		LearnStatic ls=new LearnStatic();
		ls.display();
		LearnStatic.tvDisplay();
		

	}

}
