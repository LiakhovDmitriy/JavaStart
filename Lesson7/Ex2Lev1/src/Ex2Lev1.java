package A1.prog.kiev.Lesson7;

public class Ex2Lev1 {
    public static void Metod(int[] arr) {
        StringBuilder str = new StringBuilder();
        str.append('[');
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]);
            if (i != arr.length - 1) {
                str.append(", ");
            }
        }
        str.append(']');
        System.out.println(str.toString());
    }

    public static void main(String[] args) {
        /*
         * Написать свой вариант метода Arrays.toString() для int[].
         */
        int[] arr = {1, 2, 3, 10, -5, 0};
        Metod(arr);
    }
}
