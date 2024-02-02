import Models.*;

public class Lesson11Program {
    public static void main(String[] args) {
        int d = 45;

//        Car car = new Car("Audi");
//        car.printFromCar();
//        Car car1 = new Vehicle("BMV");
//        car1.printFromCar();
//        Vehicle car2 = new Vehicle("BMV");
//        car2.printFromCar();
//
//        Car.printFromCar();
//        Vehicle.printFromCar();

//        Operation operation = new Operation();
//        System.out.println(operation.sum(45, 23));
//
//        System.out.println(Operation.sum(45, 23));          // 68
//        System.out.println(Operation.subtract(45, 23));     // 22
//        System.out.println(Operation.multiply(4, 23));      // 92

//        Human tom = new Human();
//        Human bob = new Human();
//
//        tom.displayId();    // Id = 1
//        bob.displayId();    // Id = 2
//        System.out.println(Human.counter); // 3
//
//        // змінюємо Person.counter
//        Human.counter = 8;
//
//        Human sam = new Human();
//        sam.displayId();    // Id = 8
//        System.out.println(Human.counter);

//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        if(kate instanceof Client){
//
//            Client clientKate = (Client) kate;
//            clientKate.display();
//            clientKate.testFromClient();
//        }
//        else{
//
//            System.out.println("Conversion is invalid");
//        }

        //помилкове приведення
//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        Employee emp = (Employee) kate;
//        emp.display();

        // або таке
//        ((Employee)kate).display();

//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        // приведення від батьківського класу Object до типу Person
//        ((Person)kate).display();
//
//        Object sam = new Employee("Sam", "Oracle");
//        // приведення від батьківського класу Object до типу Employee
//        ((Employee)sam).display();

//        Object sam = new Employee("Sam", "Oracle");
//
//        // приведення від батьківського класу Object до типу Employee
//        Employee emp = (Employee)sam;
//        emp.display();
//        emp.testFromEmployee();
//        System.out.println(emp.getCompany());

//        Object tom = new Person("Tom");
//        Object sam = new Employee("Sam", "Oracle");
//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        Person bob = new Client("Bob", "DeutscheBank", 3000);
//        Person alice = new Employee("Alice", "Google");
//        System.out.println(kate);
//        System.out.println(bob);

//        Person tom = new Person("Tom");
//        tom.display();
//        Person sam = new Employee("Sam", "Oracle");
//        sam.display();
//        Person bob = new Client("Bob", "DeutscheBank", 3000);
//        bob.display();

//
//        Person tom = new Person("Tom");
//        tom.display();
//        Person bob = new Employee("Bob", "Microsoft");
//        bob.display();
//
//        System.out.println(tom);
//        System.out.println(bob);

//        Car car = new Car("Renault");
////        System.out.println(car.name);
////        car.name = "Audi";
////        System.out.println(car.name);
//        System.out.println(car.getName());
//        car.setName("BMW");
//        System.out.println(car.getName());
    }
}
