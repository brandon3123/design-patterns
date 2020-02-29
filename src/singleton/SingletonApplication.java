package singleton;

import singleton.implementation.Cat;

public class SingletonApplication {

    public static void main(String args[]) {
        Cat firstCat = Cat.getInstance();
        firstCat.setName("Marius");
        firstCat.setAge(2);
        firstCat.setBreed("Main Coon");
        firstCat.setColour("Black");

        System.out.println("First cat is.... " + firstCat);

        Cat secondCat = Cat.getInstance();
        secondCat.setName("Jack");
        secondCat.setAge(5);
        secondCat.setBreed("Scottish Fold");
        secondCat.setColour("Orange");

        System.out.println("Second cat is.... " + secondCat);

        System.out.println("Are these the same cat? ");

        boolean sameCat = firstCat == secondCat;

        if (sameCat) {
            System.out.println("Yes!");
        } else {
            throw new RuntimeException("You implemented singleton incorrectly!");
        }
    }
}