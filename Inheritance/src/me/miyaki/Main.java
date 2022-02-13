package me.miyaki;

class Vehicle{

    String name;
    int speed;

    Vehicle(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    Vehicle(){
        this.name = "Unnamed Vehicle";
        this.speed = -1;
    }

    void displayBasicInformation(){
        System.out.println("Vehicle Name: " + this.name + ", Vehicle Speed: " + this.speed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class Car extends Vehicle{

    String vehicleType = "Car";
    int numberOfWheels;

    Car(String name, int speed, int numberOfWheels){
        this.name = name;
        this.speed = speed;
        this.numberOfWheels = numberOfWheels;
    }

    void displayAdvancedInformation(){
        System.out.println("Vehicle Name: " + name + "\nVehicle Speed: " + speed + "km/h\nVehicle Type: " + vehicleType + "\nNumber of Wheels: " + numberOfWheels);
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}

public class Main {

    public static void main(String[] args) {

        Car fred2 = new Car("Ford F-150", 220, 4);
        fred2.displayAdvancedInformation();


    }
}
