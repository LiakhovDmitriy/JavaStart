import java.util.Scanner;

public class Les4Ex1Lev1 {
    public static void main(String[] args) {
        /*
         * С помощью циклов нарисовать «обои». Причем количество полос
         * должно вводиться с клавиатуры. В примере 7 полос.
         * ***+++***+++***+++***
         * ***+++***+++***+++***
         * ***+++***+++***+++***
         * ***+++***+++***+++***
         * ***+++***+++***+++***
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("You can stick wallpaper, enter the number of stripes: ");
        int stripes = sc.nextInt();

        System.out.println("And enter the height of the wallpaper");
        int heighWallpaper = sc.nextInt();

        for (int j = 1; j <= heighWallpaper; j++) {
            for (int i = 1; i <= stripes; i++) {
                if (i % 2 != 0) System.out.print("***");
                if (i % 2 == 0) System.out.print("+++");
            }
            System.out.println("");
        }
    }
}

