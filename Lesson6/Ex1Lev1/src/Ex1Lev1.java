package A1.prog.kiev.Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1Lev1 {

    public static int max(int[] arr) {
        int coin = 0;
        int maxValue = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > maxValue) {
                maxValue = arr[j];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        /*
         * Напишите метод который вернет максимальное число из массива целых чисел.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array, numbers are inserted randomly: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter a range for random numbers: ");
        int b = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * b);
        }
        System.out.println("Your array was generated like this: " + Arrays.toString(arr));
        System.out.println("The largest number in the array is: " + max(arr));
    }
}
