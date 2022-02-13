package me.miyaki;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Do-While Loops

        char choice;
        do{
            System.out.println("Option 1: Green");
            System.out.println("Option 2: Pink");
            System.out.println("Option 3: Blue");
            System.out.println("Option 4: Yellow");
            System.out.println("Choose which number you want.");
            choice = (char) System.in.read();
        }while(choice < '1' || choice > '4');

        switch(choice){
            case '1':
                System.out.println("You chose Green");
                break;
            case '2':
                System.out.println("You chose Pink");
                break;
            case '3':
                System.out.println("You chose Blue");
                break;
            case '4':
                System.out.println("You chose Yellow");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }

    }
}
