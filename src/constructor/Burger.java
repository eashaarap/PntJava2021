package constructor;

public class Burger {
	
	String nameOfBurger;
	char size;
	String topping;
	double priceOfBurger;
	int quantityOfBurger;
	double totalValue;
	boolean isBurgerAvailable;
	
	public Burger() {
		
	}
	
	public Burger(String nameOfBurger) {
		this.nameOfBurger = nameOfBurger;
		//System.out.println("The name of the Burger is: " + this.nameOfBurger);
	}
	
	public Burger (String nameOfBurger,String topping, char size) {
		String burgerName = this.nameOfBurger = nameOfBurger; // you are able to reassign global variables like this to a new variable
		char burgerSize= this.size = size;
		String burgerTopping = this.topping = topping;
		
		System.out.println("Burger name is: " + burgerName + " Burger size " + burgerSize + " Burger topping is: " + burgerTopping);
	}
	
	public Burger (String nameOfBurger,String topping, char size, double priceOfBurger, int quantityOfBurger, double totalValue, boolean isBurgerAvailable) {
		String burgerName = this.nameOfBurger = nameOfBurger; // you are able to reassign global variables like this to a new variable
		char burgerSize= this.size = size;
		String burgerTopping = this.topping = topping;
		double burgerPrice = this.priceOfBurger = priceOfBurger;
		int quantity = this.quantityOfBurger=quantityOfBurger;
		double total = this.totalValue=totalValue;
		boolean AvailabilityCheck = this.isBurgerAvailable = isBurgerAvailable;
		
		System.out.println("Burger name is: " + burgerName + " Burger size " + burgerSize + " Burger topping is: " + burgerTopping + " Burger price is: " + burgerPrice + " Quantify of Burger is: " + quantity + " Total value is "+ total + " Burger Availibility " + AvailabilityCheck);
	}

	public static void main(String[] args) {
		
		Burger myBurger = new Burger();
		
		Burger yourBurger = new Burger("McDonalds");
		System.out.println("Your burger is "+ yourBurger.nameOfBurger);
		
		Burger herBurger = new Burger("McDonalds");
		System.out.println("Her burger is "+ herBurger.nameOfBurger);
		
		Burger ourBurger = new Burger("Wendys", "lettuce", 'L', 10.99, 30, 329.70, true);

		
		
		
	}

}
