package Sorted;

import java.util.Scanner;

public class Sorting {
    public static Scanner sc = new Scanner(System.in);
    public static int[] getIntegers(int numbers){
        int[] sampleArray = new int[numbers];
        System.out.println("Enter " + numbers + " digits");
        for (int i = 0; i < numbers; i++) {
            sampleArray[i] = sc.nextInt();
        }
        printArray(sampleArray);
        return sampleArray;
    }
    public static void printArray(int[] array){
        System.out.println("The array is \r");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }

    public static int[] sortIntegers(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            for(int j = i+1; j< arrays.length; j++){
                int temp = 0;
                if(arrays[i]<arrays[j]){
                    temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        return arrays;
    }

    public static void main(String[] args) {
        System.out.println("enter number of elements");
        int numbers = sc.nextInt();
        int[] myArray = getIntegers(numbers);
        int[] sortedArray = sortIntegers(myArray);
        printArray(sortedArray);

    }
}
