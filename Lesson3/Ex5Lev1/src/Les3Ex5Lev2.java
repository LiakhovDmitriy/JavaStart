import java.util.Scanner;

public class Les3Ex5Lev2 {
    public static void main(String[] args) {
        /*
         * Есть круг с центром в начале координат и радиусом 4. Пользователь
         * вводит с клавиатуры координаты точки x и y. Написать программу которая
         * определит лежит ли эта точка внутри круга или нет.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X coordinate ");
        int coordinateS = sc.nextInt();

        System.out.println("Enter Y coordinate ");
        int coordinateY = sc.nextInt();
        int radius = 4;

        //Работает только для круга с центром (0;0)

        if (coordinateS * coordinateS + coordinateY * coordinateY <= radius * radius) {
            System.out.println("Point lies in a circle");
        } else System.out.println("The point lies outside the circle.");
    }
}
