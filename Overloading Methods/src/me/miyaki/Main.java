package me.miyaki;

public class Main {

    public static void main(String[] args) {

        class Booger{

            void findSum(){
                System.out.println("You did not give any values!");
            }

            int findSum(int a, int b){
                int sum = a + b;
                return sum;
            }

            int findSum(int a, int b, int c){
                int sum = a + b + c;
                return sum;
            }

        }

        Booger one = new Booger();
        System.out.println(one.findSum(1, 5));
        System.out.println(one.findSum(1, 5, 6));
        one.findSum();
    }
}
