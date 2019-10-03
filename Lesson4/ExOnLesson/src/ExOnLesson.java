package A1.prog.kiev.Lesson4;

public class ExOnLesson {
    public static void main(String[] args) {

        /*
         * Если число делится на 3 выводится вместо числа " :) "
         * Если число делится на 5 выводится вместо числа " :( "
         * Если число делится на 3 и 5 выводится вместо числа " ? "
         */
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(":)");
            }
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(":(");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("?");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }
}
