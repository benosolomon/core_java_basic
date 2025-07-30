package oops;


class Person {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
public class EncapsulationExample {
    public static void main(String[] args) {
    Person person = new Person();

    person.setFirstName("Beno");
    System.out.println(person.getFirstName());
        person.setLastName("Solomon");
        System.out.println(person.getLastName());
    }
}
