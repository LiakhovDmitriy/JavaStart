package A1.prog.kiev.Lesson4;

public class Les4Ex6Lev2 {
    public static void main(String[] args) {
        /*
         * С помощью циклов вывести на экран все простые числа от 1 до 100.
         * Простое число — число которое делиться нацело только на единицу или
         * само на себя. Первые простые числа это — 2, 3, 5, 7
         */
        for (int i = 2; i <= 100; i++) {
            boolean a = false;
            for (int j = 2; j * j <= i; j++) {
                a = (i % j == 0);
                if (a) {
                    break;
                }
            }
            if (!a) {
                System.out.print(i + ", ");
            }
        }
    }
}
