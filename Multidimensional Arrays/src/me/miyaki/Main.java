package me.miyaki;

public class Main {

    public static void main(String[] args) {

        int pizza[][][] = new int[6][4][5];
        for(int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(pizza[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
