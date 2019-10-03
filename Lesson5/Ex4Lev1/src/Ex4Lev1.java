package A1.prog.kiev.Lesson5;

import java.util.Scanner;

public class Ex4Lev1 {
    public static void main(String[] args) {
        /*
         * Введите строку текста с клавиатуры — реализуйте программу для
         * возможности подсчета количества символа — 'b' в этой строке, с выводом
         * результат на экран.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stripe");
        String str = sc.nextLine();
        int count = 0;

        char[] t = str.toCharArray();

        for (int i = 0; i < t.length; i++) {
            if (t[i]=='b') {
                count+=1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
