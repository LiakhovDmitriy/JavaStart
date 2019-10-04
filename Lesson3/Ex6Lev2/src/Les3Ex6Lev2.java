import java.util.Scanner;

public class Les3Ex6Lev2 {
    public static void main(String[] args) {
        /*
         * Дан треугольник координаты вершин А(0,0), В(4,4), С(6,1). Пользователь
         * вводит с клавиатуры координаты точки x и y. Написать программу которая
         * определит лежит ли эта точка внутри треугольника или нет.
         */
//Точка А
        int xA = 0;
        int yA = 0;
//Точка Б
        int xB = 4;
        int yB = 4;
//Точка С
        int xC = 6;
        int yC = 1;
//Точка которую вводит пользователь \/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X coordinate");
        int xD = sc.nextInt();
        System.out.println("Enter Y coordinate");
        int yD = sc.nextInt();

        if (((xA - xD) * (yB - yA) - (xB - xA) * (yA - yD) <= 0) && ((xB - xD) * (yC - yB) - (xC - xB) * (yB - yD) <= 0) && ((xC - xD) * (yA - yC) - (xA - xC) * (yC - yD) <= 0)) {
            System.out.println("The point belongs to the triangle");
        } else System.out.println("The point does not belong to the triangle");
    }
}
