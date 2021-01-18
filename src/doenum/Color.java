package doenum;

public enum Color {

    RED,GREEN,YELLOW,BLUE;

    String name="James";
    static int age;
    public void tvDisplay(){
        System.out.println("This is TV Display");
    }

    Color(){

    }
    Color(String name){
        this.name=name;
    }

}
