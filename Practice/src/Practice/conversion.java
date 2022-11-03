package Practice;

public class conversion {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches > 0 && inches <= 12)) {
            double feetToCm = feet * 30.48;
            double inchToCm = inches * 2.54;
            return (double) (feetToCm + inchToCm);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        double answer = calcFeetAndInchesToCentimeters(6,1);
        System.out.println(answer);
    }
}
