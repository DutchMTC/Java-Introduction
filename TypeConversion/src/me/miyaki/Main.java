package me.miyaki;

public class Main {

    public static void main(String[] args) {

        int jerry = 10000;
        short anotherJerry;
        anotherJerry = (short)jerry;
        System.out.println(anotherJerry);

        int iTwo = (int)125.6;
        System.out.println(iTwo);

        byte fiona = 100;
        byte shrek = 100;
        int result = shrek * fiona;
        System.out.println(result);

        byte b = 50;
        b = (byte)(b * 2);
        System.out.println(b);


    }
}
