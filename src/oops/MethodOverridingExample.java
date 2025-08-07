package oops;

class Person1 {
    String name;
    int age;
    public Person1(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void print() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
    }
}

class Employee1 extends Person1 {
        String designation;
        public Employee1(String name,int age,String designation){
            super(name,age);
            this.designation = designation;
        }
        public void print() {
            super.print();
            System.out.println("Designation: " + designation);
        }
}
public class MethodOverridingExample {
    public static void main(String[] args) {
        Employee1 employee = new Employee1("Kartick",2,"Manager");
        employee.print();

    }
}
