package basic;

public class LearnBlock {
	
	// Block
	
	{ // block start point
		
		// Block body
		
		System.out.println("Hello");
		System.out.println("this is a block");
		
	} //  block End point
	
	
	public static void display() {
		// Method/ Function
		
		System.out.println("This is display method");
		
		{
			System.out.println("This is from inside of block");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		{ // block start point
			
			// Block body
			
			System.out.println("Hello");
			System.out.println("this is a block");
			
		} //  block End point
		
		// static method/ variable we can call by class name
		LearnBlock.display();
		
		
		
		
	}
	
	
	
	
	
	

}
