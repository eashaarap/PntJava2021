package oop.inheritance;

public class Father extends GrandFather{

    //variables
    public String FatherFavoriteDish= "Chicken";



    public String FatherFavoriteSport= "Tennis";
    public String FatherFavoriteSSN= "12456789";

    private String FatherAccountNumber;



    public String getFatherAccountNumber() {
        return FatherAccountNumber;
    }

    public void setFatherAccountNumber(String fatherAccountNumber) {
        FatherAccountNumber = fatherAccountNumber;
    }

    public void swim(){
        System.out.println("Father can swim");
    }
    public void beard(){
        System.out.println("Father has long beard");
    }
    public void hairColor(){
        System.out.println("Father's hair color is black and white");
    }
    public void eyes(){
        System.out.println("Fathers eyes are brown");
    }
    public void goodPersonality(){
        System.out.println("Father's personality is good");

    }
}
