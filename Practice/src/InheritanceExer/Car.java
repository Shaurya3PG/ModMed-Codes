package InheritanceExer;

public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currGear = 1;
    }

    public void changeGear(int currGear) {
        this.currGear = currGear;
        System.out.println("gear changed to " + currGear);
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("speed " + speed + "dire " + direction);
    }


}
