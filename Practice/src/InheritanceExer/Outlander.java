package InheritanceExer;

public class Outlander extends Car{
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 4, 4, 4, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelo = getCurrVelo() + rate;

        if(newVelo == 0){
            stop();
            changeGear(1);
        }
        else if(newVelo > 0 && newVelo < 10){
            changeGear(1);
        } else if (newVelo>10 && newVelo<20) {
            changeGear(2);

        } else if (newVelo > 20 && newVelo <30) {
            changeGear(3);
        }
        else{
            changeGear(4);
        }

        if(newVelo > 0){
            changeVelocity(newVelo,getCurrDir());
        }
    }
}
