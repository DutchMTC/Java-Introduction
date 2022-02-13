package me.miyaki;

public class Main {

    public static void main(String[] args) {

        class Human{

            // Methods
            // type name(parameters){}
            void talk(String name, int age){
                System.out.println("I am " + name + " and I am " + age + " years old.");
            }

            int calculate(int one, int two, int three){
                return one * two * three;
            }

        }

        Human human4 = new Human();
        int product = human4.calculate(5, 1, 6);
        human4.talk("Sript", 69);

        Human human5 = new Human();
        int product2 = human5.calculate(8, 1, 55);
        human5.talk("Miyaki", 17);

        System.out.println("First Human: " + product + ", Second Human: " + product2);

    }
}
