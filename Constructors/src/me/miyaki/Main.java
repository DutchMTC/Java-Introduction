package me.miyaki;

public class Main {

    public static void main(String[] args) {

        class Zebra{
            String name;
            int age;

            // Constructor
            Zebra(String paramName, int paramAge){
                System.out.println("Making a new Zebra...");
                name = paramName;
                age = paramAge;
                talk();
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            void talk(){
                System.out.println("*insert zebra sound*, Hi! My name is " + name + " and I am " + age + " years old.");
            }

            void ageUp(){
                age++;
                System.out.println("I am now " + age);
            }
        }

        Zebra zebra1 = new Zebra("Bob", 14);
        System.out.println(zebra1.getName());
        zebra1.setName("Miyaki");
        System.out.println(zebra1.getName());
        System.out.println(zebra1.getAge());
        zebra1.setAge(69);
        System.out.println(zebra1.getAge());

    }
}
