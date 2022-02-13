package me.miyaki;

public class Main {

    public static void main(String[] args) {

        // Relational Operators for If Statements
        // == Equal To
        // != Is not Equal To
        // > Greater Than
        // < Less Than
        // >= Greater or Equal
        // <= Less or Equal

        String name = "bob";
        int num1 = 5;
        int num2 = 10;

        // Equal to
        if(name == "bob"){
            System.out.println("Equal!");
        }
        else{
            System.out.println("Not Equal!");
        }

        // Is NOT equal to
        if(name != "sherry"){
            System.out.println("Equal!");
        }
        else{
            System.out.println("Not Equal!");
        }

        // Is greater than
        if(num1 > num2){
            System.out.println("Bigger!");
        }
        else{
            System.out.println("Smaller!");
        }

        // Is less than
        if(num1 < num2){
            System.out.println("Bigger!");
        }
        else{
            System.out.println("Smaller!");
        }

        // Is greater or equal to
        if(num1 >= num2){
            System.out.println("Bigger!");
        }
        else{
            System.out.println("Smaller!");
        }

        // Is less or equal to
        if(num1 <= num2){
            System.out.println("Bigger!");
        }
        else{
            System.out.println("Smaller!");
        }

    }
}
