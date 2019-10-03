package A1.prog.kiev.Lesson7;

import java.util.Scanner;

public class Ex3Lev1 {
    public static void main(String[] args) {
        /*
         * Ввести с консоли число в бинарном формате. Перевести его в
         * десятичный и вывести на экран (“10” -> 2).
         */

        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println("In binary format " + st + " is " + Integer.parseInt(st,2));
    }
}