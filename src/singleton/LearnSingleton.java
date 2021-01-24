package singleton;

public class LearnSingleton {
    /*
        Singleton class: we are allowed to create one instance of a class at a time
            Using private constructor we can ensure that no more than one object can be created at a time

     */

    String collegeName = "Queens College";


    private LearnSingleton(){


    }
    //TO USE PRIVATE CONSTRUCTORS:
    // Create Instance variable/object
    public static LearnSingleton instance = new LearnSingleton();
    //Create return type of method
    public static LearnSingleton getInstance(){
        return instance;
    }

}
