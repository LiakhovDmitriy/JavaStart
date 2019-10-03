package A1.prog.kiev.Lesson5;

public class SimpleClass2 {
    public static void main(String[] args) {
        /*
         * Створюємо двомірний масив. Присвоюємо значення і виводимо їх.
         * Також виведу сумму масива.
         */

        int[][] array = new int[5][5];
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = i + j;
                System.out.print(array[i][j] + " ");
                total += i + j;
            }
            System.out.println();
        }
        System.out.println(total);
    }
}
