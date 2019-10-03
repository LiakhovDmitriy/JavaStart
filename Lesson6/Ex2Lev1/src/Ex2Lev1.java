package A1.prog.kiev.Lesson6;

import java.util.Scanner;

public class Ex2Lev1 {
    public static String line(int a, double b, String c) {
        double w = a + b;
        String lineOver = c + w;
        return lineOver;
    }


    public static void main(String[] args) {
        /*
         * Реализуйте метод параметрами которого являются - целое число,
         * вещественное число и строка. Возвращает он конкатенацию строки с
         * суммой вещественного и целого числа.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a = sc.nextInt();
        System.out.println("Enter fractional number: ");
        double b = sc.nextDouble();
        System.out.println("Enter the string: ");
        String c = sc.next();

        System.out.println("You got a string concatenation with the sum of a fractional and an integer " + line(a, b, c));


    }
}
