package me.miyaki;

public class Main {

    public static void main(String[] args) {

        // Byte
        byte bob = 7;
        System.out.println(bob);

        // Short
        short shortBob = 32000;
        System.out.println(shortBob);

        // Int
        int integerBob = 6942069;
        System.out.println(integerBob);

        // Long
        int lightspeed = 186000;
        long days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance = lightspeed * seconds;
        System.out.println(distance);

        // Float
        float myBankAccount = 69.42f;
        System.out.println(myBankAccount);

        // Double
        double longNumberLmao = 69.4206942069420;
        System.out.println(longNumberLmao);

        // Area of a Circle
        double pi, r, a;
        r = 8.7;
        pi = 3.14159;
        a = pi * r * r;
        System.out.println("The area is: " + a);

        // Char
        char letter = '\u6942';
        System.out.println(letter);

        // Loop
        char bob2 = 1;
        for(int i = 0; i < 50000; i++){
            bob2++;
            System.out.println(bob2);
        }

        // Boolean
        boolean imCool = true;
        boolean nateIsCool = false;

        System.out.println(imCool);
        System.out.println(nateIsCool);

    }
}
