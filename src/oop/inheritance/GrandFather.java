package oop.inheritance;

public class GrandFather {

    //Variable
    public String grandFatherFavoriteDish= "Fish";
    public String grandFatherFavoriteSport= "Soccer";
    public String grandFatherFavoriteSSN= "13456789";

    private String grandFatherAccountNumber;

    public GrandFather(){

    }

    public GrandFather(String grandFatherFavoriteDish) {
        this.grandFatherFavoriteDish = grandFatherFavoriteDish;
    }

    public GrandFather(String grandFatherFavoriteDish, String grandFatherFavoriteSport, String grandFatherFavoriteSSN) {
        this.grandFatherFavoriteDish = grandFatherFavoriteDish;
        this.grandFatherFavoriteSport = grandFatherFavoriteSport;
        this.grandFatherFavoriteSSN = grandFatherFavoriteSSN;
    }

    public String getGrandFatherAccountNumber() {
        return grandFatherAccountNumber;
    }

    public void setGrandFatherAccountNumber(String grandFatherAccountNumber) {
        this.grandFatherAccountNumber = grandFatherAccountNumber;
    }

    public void fishing(){
        System.out.println("Grand father loves to go fishing");
    }
    public void height(){
        System.out.println("Grand Father height is 6.5");
    }

    public void playGame(){
        System.out.println("Grand father plays soccer");
    }
    public void bloodGroup(){
        System.out.println("Grand father blood group A-");

    } public void tellStories(){
        System.out.println("Grand Father loves to tell stories");

    } public void loveAnimals() {
        System.out.println("Grand father loves animals");
    }

    }
