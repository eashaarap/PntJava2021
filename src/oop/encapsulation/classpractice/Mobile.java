package oop.encapsulation.classpractice;

public class Mobile {

    public String mobileBrandName;

    private String mobileModel;
    private int mobileMemory;
    private String mobileColor;
    private double mobilePrice;
    private boolean isAvailable;

    public Mobile (){

    }
    public static void Mobile (String mobileBrandName){
        System.out.println(" My phones brand name is " + mobileBrandName);
    }

    public Mobile(String mobileBrandName, String mobileModel){
        this.mobileBrandName=mobileBrandName;
        this.mobileModel=mobileModel;
    }
    public Mobile(String mobileColor){
        this.mobileColor = mobileColor;
    }

    public Mobile(int mobileMemory, String mobileColor, double mobilePrice, boolean isAvailable) {
        this.mobileMemory = mobileMemory;
        this.mobileColor = mobileColor;
        this.mobilePrice = mobilePrice;
        this.isAvailable = isAvailable;
    }

    public String getMobileBrandName(){
        return mobileBrandName;
    }
    public void setMobileBrandName(){
        this.mobileBrandName=mobileBrandName;
    }

    public String getMobileModel(){
        return mobileModel;
    }
    public void setMobileModel(String mobileModel){
        this.mobileModel = mobileModel;
    }
    public int getMobileMemory(){
        return mobileMemory;
    }
    public void setMobileMemory(int mobileMemory){
        this.mobileMemory=mobileMemory;
    }
    public double getMobilePrice(){
        return mobilePrice;
    }
    public void setMobilePrice(double mobilePrice){
        this.mobilePrice= mobilePrice;
    }

    public String getMobileColor() {
        return mobileColor;
    }

    public void setMobileColor(String mobileColor) {
        this.mobileColor = mobileColor;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
