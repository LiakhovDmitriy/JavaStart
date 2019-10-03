package A1.prog.kiev.Lesson6;

public class OnLesson {
    /**
     * @param a
     * @param b
     * @return
     */
    public static int sum(int a, int b) {
        int s = a + b;
        return s;
    }

    /**
     * @param a <code>int</code>
     * @param b text
     * @param c text
     * @return text
     * @author D
     */
    public static int sum(int a, int b, int c) {
        int s = a + b + c;
        return s;
    }


    private static void drawing(char s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int d = 5;
        int f = 10;
        int e = 5 + sum(d, f) + sum(1,2,3);
        System.out.println(e);

        drawing('+', 10);
    }
}
