package Models;

public class Vehicle extends Car{
    public Vehicle(String name) {
        super(name);
    }

    public static void printFromCar(){
        System.out.println("hello i am vehicle");
    }
}
