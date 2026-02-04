public class Vehicle {
    String brand;
    int year;

    Vehicle() {
        this("Unknown", 0);
    }

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Vehicle constructor called");
        System.out.println("Vehicle: brand = " + brand + ", year = " + year);
    }
}

class Car extends Vehicle{
    public String model;
    public String color;

    Car(){
        this("Generic", "White");
    }

    Car(String model){
       this(model, "white");
    }
    Car(String model, String color) {
        super("Unknown", 2025);
        this.model = model;
        this.color = color;
        System.out.println("Car constructor called");
        System.out.println("Car: model = " + model + ", color = " + color);
    }
}
class test {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Toyota");
        Car c3 = new Car("Honda", "Red");

    }
}
