package A1.prog.kiev.Lesson6;

import java.util.Scanner;

public class Ex3Lev1 {
    public static void kub (int a, int b){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (a == i || b == j || i == 1 || j == 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the square");
        int height = sc.nextInt();

        System.out.println("Enter the wight of the square");
        int wight = sc.nextInt();

        kub(height,wight);
    }
}
