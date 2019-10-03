package A1.prog.kiev.Lesson4;

import java.util.Scanner;

public class Ex4Lev1 {
    public static void main(String[] args) {
        /*
         * Выведите на экран прямоугольник из *. Причем высота и ширина
         * прямоугольника вводятся с клавиатуры. Например ниже представлен
         * прямоугольник с высотой 4 и шириной 5.
         * *****
         * *   *
         * *   *
         * *****
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the square");
        int height = sc.nextInt();

        System.out.println("Enter the wight of the square");
        int wight = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= wight; j++) {
                if (height == i || wight == j || i == 1 || j == 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
