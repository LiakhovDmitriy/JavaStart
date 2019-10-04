import java.util.Scanner;

public class Les7Ex5Lev2 {
    public static void main(String[] args) {
        /*
         * Расстояние Хэмминга между двумя целыми числами - это число
         * позиций, в которых биты различаются .
         * Для примера:
         * 117 = 0 1 1 1 0 1 0 1
         * 17 =  0 0 0 1 0 0 0 1
         * -----------------------------------
         * H = 0+1+1+0+0+1+0+0 = 3 - расстояние Хэмминга между (117,17)
         * Даны два положительных целых числа (N, M) в десятичном виде. Вам
         * необходимо подсчитать расстояние Хэмминга между этими двумя
         * числами.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Hamming distance between two integers is a number positions in which bits differ.\nEnter the first number: ");
        int one = sc.nextInt();
        System.out.println("Enter the second number: ");
        int second = sc.nextInt();

        String stOne = Integer.toBinaryString(one);
        String stSecond = Integer.toBinaryString(second);
        System.out.println(one + " In binary " + stOne);
        System.out.println(second + " In binary " + stSecond);

        int max = stOne.length();
        if (stOne.length() < stSecond.length()) {
            max = stSecond.length();
        }
        int[] arrOne = new int[max + 1];
        int[] arrSecond = new int[max + 1];

        for (int i = 1; i < stOne.length() + 1; i++) {
            arrOne[arrOne.length - i] = Character.getNumericValue(stOne.charAt(stOne.length() - i));
        }
        for (int i = 1; i < stSecond.length() + 1; i++) {
            arrSecond[arrSecond.length - i] = Character.getNumericValue(stSecond.charAt(stSecond.length() - i));
        }
        //System.out.println(Arrays.toString(arrOne));
        //System.out.println(Arrays.toString(arrSecond));
        int count = 0;
        for (int i = 0; i < max + 1; i++) {
            if (arrOne[i] != arrSecond[i]) {
                count += 1;
            }
        }
        System.out.println("Hamming length between " + one + " END " + second + " IS " + count);
    }
}