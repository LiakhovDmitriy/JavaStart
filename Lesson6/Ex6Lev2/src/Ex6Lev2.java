package A1.prog.kiev.Lesson6;

public class Ex6Lev2 {
    public static void main(String[] args) {
        /*
         * Число-палиндром с обеих сторон (справа налево и слева направо)
         * читается одинаково. Самое большое число-палиндром, полученное
         * умножением двух двузначных чисел – 9009 = 91 × 99.
         * Найдите самый большой палиндром, полученный умножением двух
         * трехзначных чисел. (4 часа)
         *
         * Все числа от умножения переводятся в строку, + дополнительно переворачивается и сравнивается с исходной. И просто ищем самое большое.
         * Сначала делал через масивы и строки. Слииишком много строк кода.
         */

        int maxPolindrom = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = i; j <= 999; j++) {
                int polindrom = i * j;
                StringBuilder number = new StringBuilder("" + polindrom); //Так как ето строка там не пускает компилятор без строки("")
                String numberTwo = "" + polindrom;
                number.reverse();
                if (numberTwo.equals(number.toString()) && maxPolindrom < polindrom) {
                    maxPolindrom = polindrom;
                }
            }
        }
        System.out.println("The largest palindrome from multiplying two three-digit numbers is: " + maxPolindrom);
    }
}
