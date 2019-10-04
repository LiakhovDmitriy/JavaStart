import java.util.Scanner;

public class Les3Ex3Lev1 {
    public static void main(String[] args) {
        /*
         * Определить количество дней в году, который вводит пользователь. В
         * високосном годе - 366 дней, тогда как в обычном 365. Високосный год
         * определяется по следующему правилу:
         * Год високосный, если он делится на четыре без остатка, но если он
         * делится на 100 без остатка, это не високосный год. Однако, если он
         * делится без остатка на 400, это високосный год.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Number of days in a year: " + 366);
        } else System.out.println("Number of days in a year: " + 365);

    }
}
