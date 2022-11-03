package minElementChallenge;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int[] readIntegers(int count){
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }
    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]<=min){
                min = array[i];
            }
        }
        System.out.print("The minimum is: ");
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Enter the length of the array you need");
        int count = sc.nextInt();
        int[] array = readIntegers(count);
        int minimum = findMin(array);
        System.out.println(minimum);
    }
}
