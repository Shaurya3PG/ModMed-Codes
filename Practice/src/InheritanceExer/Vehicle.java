package InheritanceExer;

public class Vehicle {
    private String name;
    private String size;
    private int currVelo;
    private int currDir;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currVelo = 0;
        this.currDir = 0;
    }

    public void steer(int direction){
        this.currDir += direction;
        System.out.println("Something happened");
    }
    public void move(int velocity, int direction){
        currDir = direction;
        currVelo = velocity;
        System.out.println("Moving in" + currDir + currVelo);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrVelo() {
        return currVelo;
    }

    public int getCurrDir() {
        return currDir;
    }

    public void stop(){
        this.currVelo = 0;
    }
}
