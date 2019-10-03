package A1.prog.kiev.Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6Lev2 {
    public static void main(String[] args) {
        /*
         * Написать код для зеркального переворота массива (7,2,9,4) -> (4,9,2,7). -
         * массив может быть произвольной длинны. (При выполнении задания
         * использовать дополнительный массив нельзя)(1 час)
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int one = array[i];
            int two = array[array.length - i - 1];
            array[i] = two;
            array[array.length - i - 1] = one;
        }
        System.out.println(Arrays.toString(array));
    }
}
