package A1.prog.kiev.Lesson4;

import java.util.Scanner;

public class Ex5Lev2 {
    public static void main(String[] args) {
        /* С помощью цикла (только одного) нарисовать такую фигуру. Причем
         * максимальная высота этой фигуры вводиться с клавиатуры (в примере
         * максимальная высота - 4)
         * *
         * **
         * ***
         * ****
         * ***
         * **
         * *
         */
        System.out.println("If you want to draw a vertical mountain, enter his height: ");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int countOne = 0;
        int countTwo = -1;

        for (int i = 0; i < height * height; i++) {
            System.out.print("*");
            countTwo++;
            if (countOne == countTwo) {
                System.out.println();
                countTwo = -1;
                if (i < (height * height + height) / 2 - 1) {
                    countOne++;
                } else countOne--;
            }
            //to hard
        }
    }
}
