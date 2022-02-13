package me.miyaki;

class Tiger{

    String name;
    int age;

    Tiger(String name, int age){
        this.name = name;
        this.age = age;
    }

    Tiger(){
        this.name = null;
        this.age = -1;
    }

    Tiger(Tiger object){
        this.name = object.name;
        this.age = object.age;
    }

    public String getName() {
        if (this.name == null){
            return "You did not ever provide a name";
        }else {
            return name;
        }
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
        System.out.println("Hi, I am " + this.name + " the thiger, nice to meet you.");
        System.out.println("I am " + this.age + " years old.");
    }

}

public class Main {

    public static void main(String[] args) {

        Tiger tiger1 = new Tiger("Larry", 165);
        tiger1.talk();

        Tiger tiger2 = new Tiger(tiger1);
        tiger2.setAge(10);
        tiger2.talk();

    }
}
