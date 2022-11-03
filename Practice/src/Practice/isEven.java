package Practice;

public class isEven {
    public static void main(String[] args) {
        int number = 7;
        System.out.println(isEvenNumber(number));
    }
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
