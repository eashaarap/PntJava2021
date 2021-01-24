package oop.encapsulation;

public class Pizza {

    /*
        Encapsulation: Data Hiding
     */

    public String pizzaName;

    private String toppingName;
    private int price;
    private char size;
    private String typeOfPizza;
    private boolean isAvailable;

    public Pizza(){

    }

    public Pizza(String pizzaName) {
    }

    public Pizza(String pizzaName, String toppingName) {
        this.pizzaName = pizzaName;
        this.toppingName = toppingName;
    }

    public Pizza(String pizzaName, String toppingName, int price, char size, String typeOfPizza, boolean isAvailable) {
        this.pizzaName = pizzaName;
        this.toppingName = toppingName;
        this.price = price;
        this.size = size;
        this.typeOfPizza = typeOfPizza;
        this.isAvailable = isAvailable;
    }

    //Getter Method and Setter Method
        //Getter Method: Return Type
        public String getToppingName(){
            return toppingName;
        };
        //Setter Method: non return type
    public void setToppingName(String toppingName) {
        this.toppingName=toppingName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getTypeOfPizza() {
        return typeOfPizza;
    }

    public void setTypeOfPizza(String typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
