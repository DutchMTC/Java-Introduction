package me.miyaki;

public class Main {

    public static void main(String[] args) {

        // EX: If I'm 16 years old, print out a message saying "You're cool!"
        int age = 6;
        int requiredAge = 16;
        // If your age is 16.
        if(age >= requiredAge) {
            System.out.println("You're cool!");
            // If within the if
            if (age >= 70) {
                System.out.println("You're old!");
            } else {
                System.out.println("You're not so old!");
            }
            // If your age is not 16.
        }
        else{
            System.out.println("You're not so cool :(");
            // If within the else.
            if(age <= 5){
                System.out.println("Why are you even here?");
            }
        }

        boolean isCool = true;
        if(isCool == true){
            System.out.println("Cool!");
        }
        else if(isCool == false){
            System.out.println("lmao you're not cool.");
        }
        else{
            System.out.println("How did you even manage to get this?");
        }
    }
}
