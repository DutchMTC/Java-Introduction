package me.miyaki;

public class Main {

    public static void main(String[] args) {

        //[data type] [name][]
        double floatingNumbers[] = {1.23,4.11,5.22,5.22};
        double total = floatingNumbers[0] + floatingNumbers[1] + floatingNumbers[2] + floatingNumbers[3];
        double average = total / 4;
        System.out.println(average);

    }
}
