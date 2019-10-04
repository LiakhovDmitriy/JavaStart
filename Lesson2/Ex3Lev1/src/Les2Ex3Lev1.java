import java.util.Scanner;

public class Les2Ex3Lev1 {
    public static void main(String[] args) {
        /*
         * Написать програму которая вычислит и выведет на экран длину
         * окружности, если ее радиус считывается с клавиатуры.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the circle radius, and press - \"Enter\"");
        double radius = sc.nextDouble();

        double circle = 2 * radius * Math.PI;

        System.out.println("Circumference is " + circle);
    }
}
