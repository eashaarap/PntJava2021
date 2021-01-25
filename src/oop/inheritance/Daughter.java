package oop.inheritance;

public class Daughter extends Father{

    public String daughterFavoriteDish= "Fish";
    public String daughterFavoriteSport= "Badminton";
    public String daughterFavoriteSSN= "93456789";

    private String daughterAccountNumber;

    public Daughter() {
    }

    public Daughter(String daughterFavoriteDish) {
        this.daughterFavoriteDish = daughterFavoriteDish;
    }

    public Daughter(String daughterFavoriteDish, String daughterFavoriteSport, String daughterFavoriteSSN) {
        this.daughterFavoriteDish = daughterFavoriteDish;
        this.daughterFavoriteSport = daughterFavoriteSport;
        this.daughterFavoriteSSN = daughterFavoriteSSN;
    }

    public String getDaughterAccountNumber() {
        return daughterAccountNumber;
    }

    public void setDaughterAccountNumber(String daughterAccountNumber) {
        this.daughterAccountNumber = daughterAccountNumber;
    }

    public void dancing(){
        System.out.println("Daughter loves to dance");
    }
    public void singing(){
        System.out.println("Daughter loves to sing");
    }
    public void learning(){
        System.out.println("Daughter loves to learn");
    }
    public void shopping(){
        System.out.println("Daughter loves to shop when she is sad");
    }
    public void bodyBuilder(){
        System.out.println("Daughter loves to build body");
    }
    public void flyOnTheSky(){
        System.out.println("Daughter will fly in the sky when she gets a QA job");
    }

}

