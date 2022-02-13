package me.miyaki;

public class Main {

    public static void main(String[] args) {

        // Addition
        int addition = 69 + 420;
        double addition2 = 12.5 + 13.6;
        System.out.println(addition + " " + addition2);

        //Subtraction
        int subtraction = 51 - 31;
        double subtraction2 = 31.5 - 11.3;
        System.out.println(subtraction + " " + subtraction2);

        //Multiplication
        int multiplication = 5 * 12;
        double multiplication2 = 31.5 * 69.42;
        System.out.println(multiplication + " " + multiplication2);

        //Division
        int division = 51 / 32;
        double division2 = 41.5 / 31.2;
        System.out.println(division + " " + division2);

        //Modulus
        // 6 fits 4 times in 25. The remainder is 1
        int mod = 25 % 6;
        double mod2 = 66.0 % 11.0;
        System.out.println(mod + " " + mod2);

        //Compound Assignment Operators
        int plane = 0;
        // plane = plane + 1; == plane++;
        plane++;
        System.out.println(plane);

        int planeNegative = 0;
        planeNegative--;
        System.out.println(planeNegative);

        int planeMore = 0;
        planeMore += 5;
        System.out.println(planeMore);

        int y = 245;
        int x = ++y;
        System.out.println(x);

    }
}
