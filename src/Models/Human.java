package Models;

public class Human {
    private int id;
    public static int counter;
    public static final double PI;

    static {
        counter = 1;
        PI = 3.14;
        System.out.println("Static load");
    }

    public Human() {
        id = counter++;
        System.out.println("constructor load");
    }

    public void displayId() {

        System.out.printf("Id: %d \n", id);
    }
}
