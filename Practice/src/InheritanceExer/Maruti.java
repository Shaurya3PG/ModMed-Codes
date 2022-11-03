package InheritanceExer;

public class Maruti extends Car{

    private int serviceMonths;

    public Maruti(int doors, int gears, boolean isManual, int serviceMonths) {
        super("Maaruto", "4WD", 4, doors, gears, isManual);
        this.serviceMonths = serviceMonths;
    }

    public void currSpeed(int speed){
        speed = getCurrVelo() + speed;
        System.out.println(speed);
    }
}
