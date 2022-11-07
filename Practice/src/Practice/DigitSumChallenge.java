package Practice;

public class DigitSumChallenge {
    public static int sumDigits(int number){
        int sum = 0;

        if(number<0){
            return -1;
        }
        else if(number <=9){
            return number;
        }
        else{
            int temp = number;
            while(temp!=0){
                sum =sum + temp%10;
                temp = temp/10;
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        int number = 387;
        System.out.println(sumDigits(number));
    }
}
