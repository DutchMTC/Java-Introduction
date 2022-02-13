package me.miyaki;

public class Main {

    public static void main(String[] args) {

        // While Loops
        // A way to repeat code.

        // while(condition){
        // code
        // }
        // if condition == true, loop. else, break loop.


        // Score below 50 = bad score.
        // Score above 50 = good score.
        double[] testScores = {13.4, 100.0, 90.5, 32.3, 5.0};
        int index = 0; // Index of Array

        while(index < testScores.length){ // index = 0, length = 5
            if (testScores[index] <= 50){
                System.out.println("Bad Score: " + testScores[index]);
            }
            else
                System.out.println("Good Score: " + testScores[index]);
            index++;

        }



    }
}
