package builder;

import builder.implementation.Dog;

public class BuilderApplication {

    public static void main(String args[]) {
        System.out.println("Building a new Dog...");

        Dog dog = Dog.builder()
                .breed("Husky")
                .colour("White")
                .age(2)
                .eyeColour("Blue")
                .size("Large")
                .name("Martin")
                .build();

        System.out.println("Dog create... \n " + dog);
    }

}