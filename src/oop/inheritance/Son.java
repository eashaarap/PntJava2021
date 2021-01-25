package oop.inheritance;

public class Son extends Father{

    public String sonFavoriteDish= "Turkey";
    public String sonFavoriteSport= "Cricket";
    public String sonFavoriteSSN= "13456782";

    private String sonAccountNumber;

    public Son() {
    }

    public Son(String sonFavoriteDish) {
        this.sonFavoriteDish = sonFavoriteDish;
    }

    public Son(String sonFavoriteDish, String sonFavoriteSport, String sonFavoriteSSN) {
        this.sonFavoriteDish = sonFavoriteDish;
        this.sonFavoriteSport = sonFavoriteSport;
        this.sonFavoriteSSN = sonFavoriteSSN;
    }

    public String getSonAccountNumber() {
        return sonAccountNumber;
    }

    public void setSonAccountNumber(String sonAccountNumber) {
        this.sonAccountNumber = sonAccountNumber;
    }

    public void student(){
        System.out.println("Son is a genius student");

    }
    public void player(){
        System.out.println("Son is a video game player");

    }
    public void hiking(){
        System.out.println("Son loves to go on hikes");


    }
    public void hairStyle(){
        System.out.println("Sons hairstyle is very nice");


    }
    public void bodyBuilder(){
        System.out.println("Son is not a bodybuilder");

    }

}
