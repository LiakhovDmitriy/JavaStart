package A1.prog.kiev.Lesson6;

public class Ex4Lev1 {
    public static int print(String a, int n) {
        char[] arr = a.toCharArray();
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                number += 1;
            }
        }
        n = number + 1;
        return n;
    }

    public static void main(String[] args) {
        /*
         * Напишите метод который вернет количество слов в строке текста.
         */
        int n = 0;
        String text = "Напишите метод который вернет количество слов в строке текста.";
        n = print(text, n);
        System.out.println(n);
    }
}
