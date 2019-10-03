package A1.prog.kiev.Lesson5;

public class SimpleClass3 {
    public static void main(String[] args) {
        int[][] array = new int[8][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i+j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
