import java.util.Scanner;

public class Les3Ex8Lev2 {
    public static void main(String[] args) {
        /*
         * С клавиатуры вводиться шестизначное число. Проверить, является ли
         * оно палиндромом. Примечание: палиндромом называется число, слово
         * или текст, которые одинакового читаются слева направо и справа налево.
         * Например, это числа 143341, 5555, 7117 и т. д.
         */

        Scanner sc = new Scanner(System.in);
        int person = sc.nextInt();
        int a = person / 100000;
        int b = (person % 100000) / 10000;
        int c = (person % 10000) / 1000;
        int d = (person % 1000) / 100;
        int e = (person % 100) / 10;
        int f = (person % 10);

        if (a == f && b == e && c == d) {
            System.out.println("This number is a palindrome");
        } else System.out.println("This number is not palindrome...");
    }
}
