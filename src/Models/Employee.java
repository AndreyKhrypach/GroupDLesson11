package Models;

public class Employee extends Person {

    private String company;

    public String getCompany() {
        return company;
    }

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void display() {

        System.out.printf("%s works in %s \n", getName(), company);
    }

    public void testFromEmployee() {
        System.out.println("print from employee");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
