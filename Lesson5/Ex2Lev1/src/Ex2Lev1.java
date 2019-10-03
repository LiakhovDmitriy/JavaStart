package A1.prog.kiev.Lesson5;

import java.util.Scanner;

public class Ex2Lev1 {
    public static void main(String[] args) {
        /*
         * Написать код для возможности создания массива целых чисел (размер
         * вводиться с клавиатуры) и возможности заполнения каждого его элемента
         * вручную. Выведите этот массив на экран.
         */
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int arr = sc.nextInt();
        int[] array = new int[arr];
        System.out.println("You set an array of size " + arr);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number for the cell " + i);
            array [i] = sc.nextInt();
        }
        System.out.print("You created an array: ");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
