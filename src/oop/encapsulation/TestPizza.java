package oop.encapsulation;

public class TestPizza {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();

       // When you create getter and setter, first create Getter Method then Setter method
       //When you USE, you use getter and setter value first we set value then get value

        pizza.setToppingName("Mushroom");// set or assign the value
        System.out.println(pizza.getToppingName());

    }

}
