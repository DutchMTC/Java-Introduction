package me.miyaki;

public class Main {

    public static void main(String[] args) {

        // For Loops
        // for(initialization, condition, iteration){
        // code
        // }

        // See if number is Prime
        int number;
        boolean isPrime;

        number = 14;

        if(number < 2) isPrime = false;
        else isPrime = true;

        for(int i = 2; i <= number/i; i++){
            if((number % i) == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("The number is Prime!");
        }
        else{
            System.out.println("The number is not Prime!");
        }

    }
}
