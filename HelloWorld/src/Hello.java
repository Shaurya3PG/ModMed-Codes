import java.util.Scanner;

public class Hello {
    public static void main(String... args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        for(int i = 1; i<=number; i++){
            if(number % i == 0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
