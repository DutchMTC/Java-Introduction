package me.miyaki;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String numberList[] = {"Bob", "Miyaki", "Jerry", "Tom", "Nate", "Sript"};
        System.out.println("Our Array: " + Arrays.toString(numberList));
        String toFind = "Sript";
        for(int i = 0; i < numberList.length; i++){
            System.out.println("Checking... " + numberList[i]);
            if(numberList[i] == toFind){
                System.out.println(toFind + " has been found!");
                break;
            }
        }

    }
}
