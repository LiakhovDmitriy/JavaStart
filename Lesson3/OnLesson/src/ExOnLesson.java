import java.util.Scanner;

public class ExOnLesson {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int max;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число а:");
        a = sc.nextInt();
        System.out.println("Введите число b:");
        b = sc.nextInt();
        System.out.println("Введите число с:");
        c = sc.nextInt();

        if (a <= b && b <= c) {
            max = c;
            System.out.println(max);
        } else if (a <= b && b >= c) {
            max = b;
            System.out.println(max);

        } else if (a >= b && b >= c) {
            max = a;
            System.out.println(max);
        }
    }
}

