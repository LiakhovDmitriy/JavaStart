import java.util.Scanner;

public class Les4Ex2Lev1 {
    public static void main(String[] args) {
        /*
         * Вычислить с помощью цикла факториал числа - n введенного с
         * клавиатуры (4<n<16). Факториал числа это произведение всех чисел от
         * этого числа до 1. Например 5!=5*4*3*2*1=120
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from the range - 4 < n < 16");
        int n = sc.nextInt();
        long max = 1;
        if (4 < n && n < 16) {
            for (int i = 1; i <= n; i++) {
                max *= i;
            }
        }
        System.out.println("Factorial " + n + " is " + max);

    }
}
