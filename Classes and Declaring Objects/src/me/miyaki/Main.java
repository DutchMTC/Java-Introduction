package me.miyaki;

public class Main {

    public static void main(String[] args) {

        class Human{
            String name;
            int age;
            boolean isCool;
        }

        class Dog{
            String name;
            int age;
            String breed;
        }

        // Object of the Human class
        Human human1 = new Human();

        human1.name = "Miyaki";
        human1.age = 17;
        human1.isCool = true;
        System.out.println("Name: " + human1.name + ", Age: " + human1.age + ", Cool: " + human1.isCool);

        Human human2 = new Human();

        human2.name = "Nate";
        human2.age = 17;
        human2.isCool = false;
        System.out.println("Name: " + human2.name + ", Age: " + human2.age + ", Cool: " + human2.isCool);

        Dog dog1 = new Dog();

        dog1.name = "Bodhi";
        dog1.age = 4;
        dog1.breed = "Chihuahua";
        System.out.println("Name: " + dog1.name + ", Age: " + dog1.age + ", Breed: " + dog1.breed);

    }
}
