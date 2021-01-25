package oop.inheritance;

public class Test {

    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        gf.fishing();
        gf.height();

        Father father = new Father();
        father.tellStories();
        father.eyes();
        father.beard();

        Son negash = new Son();
        negash.playGame();
        negash.swim();
        negash.player();
        negash.bodyBuilder();

        Daughter easha = new Daughter();
        easha.tellStories();
        easha.goodPersonality();
        easha.shopping();
        easha.flyOnTheSky();
        easha.dancing();

    }
}
