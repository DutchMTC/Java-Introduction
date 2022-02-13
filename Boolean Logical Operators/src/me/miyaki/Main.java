package me.miyaki;

public class Main {

    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;
        System.out.println(x);
        System.out.println(y);

        //AND Operator (Both booleans have to be the same)
        System.out.println(x & y);

        //OR Operator (At least 1 has to be true, otherwise returns false)
        System.out.println(x | y);

        //XOR Operator (Only 1 can be true, otherwise returns false)
        System.out.println(x ^ y);

        //Short-Circuit AND (Will always return first boolean)
        System.out.println((x != y) && (y!=x));

        //Short-Circuit OR (If first boolean is false, move on to next boolean)
        System.out.println(x || y);

        //NOT Operator (Returns the opposite)
        System.out.println(!x);
    }
}
