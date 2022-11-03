package reverseArrayChallenge;

import java.util.Arrays;

public class Main {
    public static void reverse(int[] array){
        int[] temp = new int[array.length];
        int j = 0;
        for (int i = array.length-1; i >= 0 ; i--) {
            temp[j] = array[i];
            j++;
        }
        System.out.println("Original array: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Reverse array: ");
        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] array = {8,7,1,23,6};
        reverse(array);
    }
}
