package InheritanceExer;

public class Main {
    public static void main(String[] args) {
        Outlander outlander = new Outlander(36);
        outlander.accelerate(5);
        outlander.accelerate(67);
        outlander.steer(56);
        Maruti alto = new Maruti(4, 6, false, 24);
        alto.currSpeed(46);
    }
}
