package oops;

class Persons {
    String name;
    public Persons() {
        System.out.println("Person Class Constructor Invoked: ");
        name = "Kohli";
    }
    public Persons(String name) {
        System.out.println("Person Class parameneter Constructor Invoked: ");
        this.name = name;
    }
}

class Employee extends Persons {
    String designation;
    public Employee() {

        System.out.println("Employee Class Constructor Invoked: ");
        designation = "Manager";
    }
    public Employee(String designation) {
        super("Beno");
        System.out.println("Employee Class Constructor Invoked: ");
        this.designation = designation;
    }


}

public class ConstructorChainingWithInheritance {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = new Employee("Senior");
    }

}
