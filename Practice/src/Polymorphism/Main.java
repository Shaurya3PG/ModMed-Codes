package Polymorphism;
class Car {
    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine(){
        System.out.println("Engine starts");
    }
    public void accelerate(){
        System.out.println("Acceleration happens");
    }
    public void brake(){
        System.out.println("aplly brake");
    }
}
class Audi extends Car{

    public Audi() {
        super("Audi", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine starts for Audi");
    }

    @Override
    public void accelerate() {
        System.out.println("Engine accelerates foor audi");    }

    @Override
    public void brake() {
        System.out.println("brakes applied for audi");
    }
}

class BMW extends Car{
    public BMW() {
        super("BMW", 3);
    }

    @Override
    public void startEngine() {
        System.out.println("engine starts for BMW");
    }

    @Override
    public void accelerate() {
        System.out.println("Engine accelerates for BMW");
    }

    @Override
    public void brake() {
        System.out.println("Brakes applied for BMW");
    }
}

class Merc extends Car{
    public Merc() {
        super("Mercedes", 5);
    }

    @Override
    public void startEngine() {
        System.out.println("EWngien starts fpor merc");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerates Merc");
    }

    @Override
    public void brake() {
        System.out.println("Brakes applied for merc");
    }
}
public class Main {
    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("The number generateed was "+ randomNumber);
        return switch (randomNumber) {
            case 1 -> new Audi();
            case 2 -> new BMW();
            case 3 -> new Merc();
            default -> null;
        };
    }

    public static void main(String[] args) {
        for(int i = 1; i<=4;i++){
            Car car = randomCar();
            System.out.println(car.getName());
            car.brake();
            car.startEngine();
            car.accelerate();



        }
    }
}
