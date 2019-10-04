import java.util.Scanner;

public class Les3Ex1Lev1 {
    public static void main(String[] args) {
        /*
         *Написать программу которая считает 4 числа c клавиатуры и выведет на экран самое большое из них.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("To display the maximum number of 4 given numbers...\n Enter first number: ");
        int first = sc.nextInt();

        System.out.println("Enter second number: ");
        int second = sc.nextInt();

        System.out.println("Enter third number: ");
        int third = sc.nextInt();

        System.out.println("Enter fourth number: ");
        int fourth = sc.nextInt();

        int max = first;

        if (second > max) max = second;
        if (third > max) max = third;
        if (fourth > max) max = fourth;

        System.out.println("The largest of four numbers is " + max);
    }
}
