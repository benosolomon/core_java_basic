package oops;

class Vehicle {
    void drive(){
        System.out.println("Driving a Vehicle");
    }

}

class Car extends Vehicle {
    void drive() {
        System.out.println("Driving a Car");
    }
    void speedUp() {
        System.out.println("Speeding up a car");
    }
}
public class UpcastingAndDowncasting {
    public static void main(String args[]) {
        // Downcasting
        Vehicle vehicle = new Car();
        Car car = (Car) vehicle;
        car.drive();
        car.speedUp();

        // upcasting

        Vehicle vehicle1 = new Car();
        vehicle1.drive();
    }
}
