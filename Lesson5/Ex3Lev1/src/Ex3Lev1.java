package A1.prog.kiev.Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3Lev1 {
    public static void main(String[] args) {
        /*
         * Создать массив случайных чисел (размером 15 элементов). Создайте
         * второй массив в два раза больше, первые 15 элементов должны быть
         * равны элементам первого массива, а остальные элементы заполнить
         * удвоенных значением начальных. Например
         * Было → {1,4,7,2}
         * Стало → {1,4,7,2,2,8,14,4}
         */
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrayRandom = new int[n];
        int[] arrayNotRandom = new int[arrayRandom.length * 2];

        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = (int) (Math.random() * 11);
        }
        for (int j = 0; j < arrayRandom.length; j++) {
            arrayNotRandom[j] = arrayRandom[j];
            arrayNotRandom[n + j] = arrayRandom[j] * 2;
        }
        System.out.println("It was     " + Arrays.toString(arrayRandom));
        System.out.println("Has become " + Arrays.toString(arrayNotRandom));
        sc.close();
    }
}
