package Practice;

public class switchStatement {
    public static void daysofTheWeek(int number){
        switch (number) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid number");
        }
    }

    public static void main(String[] args) {
        int number = 6;
        daysofTheWeek(number);
    }
}
