import java.util.Arrays;
import java.util.Scanner;

public class Les6Ex5Lev2 {
    public static void main(String[] args) {
        /*
         * Существуют такие последовательности чисел
         * 0,2,4,6,8,10,12
         * 1,4,7,10,13
         * 1,2,4,8,16,32
         * 1,3,9,27
         * 1,4,9,16,25
         * 1,8,27,64,125,216
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sequence from 4 to 7 numbers, separated by commas. And you get the next number of sequence");
        String line = sc.next();
        int[] arr = new int[8];
        String[] str = line.split("[,]");
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        if (4 <= str.length && str.length <= 7) {
            int count;
            if (arr[1] - arr[0] == arr[1] && arr[2] - arr[1] == arr[1] && arr[3] - arr[2] == arr[1]) {
                count = arr[1] - arr[0];
                if (arr[4] == 0) {
                    arr[4] = arr[3] + count;
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + " next number " + arr[4]);
                } else if (arr[5] == 0) {
                    arr[5] = arr[4] + count;
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + " next number " + arr[5]);
                } else if (arr[6] == 0) {
                    arr[6] = arr[5] + count;
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + " next number " + arr[6]);
                } else if (arr[7] == 0) {
                    arr[7] = arr[6] + count;
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + "," + arr[6] + " next number " + arr[7]);
                }
            } else if (arr[1] - arr[0] == arr[2] - arr[1] && arr[3] - arr[2] == arr[2] - arr[1]) { //a1,b4,c7,d10,e13
                count = arr[1] - arr[0];
                if (arr[4] == 0) {
                    arr[4] = arr[3] + count;
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + " next number " + arr[4]);
                } else if (arr[5] == 0) {
                    arr[5] = arr[4] + count;
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + " next number " + arr[5]);
                } else if (arr[6] == 0) {
                    arr[6] = arr[5] + count;
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + " next number " + arr[6]);
                } else if (arr[7] == 0) {
                    arr[7] = arr[6] + count;
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + "," + arr[6] + " next number " + arr[7]);
                }
            } else if (arr[1] * 2 == arr[2] && arr[2] * 2 == arr[3]) { //a1,b2,c4,d8,e16,g32
                if (arr[4] == 0) {
                    arr[4] = arr[3] * 2;
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + " next number " + arr[4]);
                } else if (arr[5] == 0) {
                    arr[5] = arr[4] * 2;
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + " next number " + arr[5]);
                } else if (arr[6] == 0) {
                    arr[6] = arr[5] * 2;
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + " next number " + arr[6]);
                } else if (arr[7] == 0) {
                    arr[7] = arr[6] * 2;
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + "," + arr[6] + " next number " + arr[7]);
                }
            } else if (arr[0] * arr[1] == arr[1] && arr[1] * arr[1] == arr[2] && arr[2] * arr[1] == arr[3]) { //a1,b3,c9,d27 e g k
                if (arr[4] == 0) {
                    arr[4] = arr[3] * arr[1];
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + " next number " + arr[4]);
                } else if (arr[5] == 0) {
                    arr[5] = arr[4] * arr[1];
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + " next number " + arr[5]);
                } else if (arr[6] == 0) {
                    arr[6] = arr[5] * arr[1];
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + " next number " + arr[6]);
                } else if (arr[7] == 0) {
                    arr[7] = arr[6] * arr[1];
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + "," + arr[6] + " next number " + arr[7]);
                }
            } else if ((arr[1] - arr[0] == ((arr[2] - arr[1]) - 2) && ((arr[2] - arr[1]) == ((arr[3] - arr[2]) - 2)))) { //a1,b4,c9,d16,e25
                if (arr[4] == 0) {
                    arr[4] = arr[3] + (arr[3] - arr[2]) + 2;
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + " next number " + arr[4]);
                } else if (arr[5] == 0) {
                    arr[5] = arr[4] + (arr[4] - arr[3]) + 2;
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + " next number " + arr[5]);
                } else if (arr[6] == 0) {
                    arr[6] = arr[5] + (arr[5] - arr[4]) + 2;
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + " next number " + arr[6]);
                } else if (arr[7] == 0) {
                    arr[7] = arr[6] + (arr[6] - arr[5]) + 2;
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + "," + arr[6] + " next number " + arr[7]);
                }
            } else if (Math.cbrt(arr[1]) == Math.cbrt(arr[2]) - 1 && Math.cbrt(arr[2]) == Math.cbrt(arr[3]) - 1) {//a1,b8,c27,d64,e125
                if (arr[4] == 0) {
                    arr[4] = (int) Math.pow((Math.cbrt(arr[3]) + 1), 3);
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + " next number " + arr[4]);
                } else if (arr[5] == 0) {
                    arr[5] = (int) Math.pow((Math.cbrt(arr[4]) + 1), 3);
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + " next number " + arr[5]);
                } else if (arr[6] == 0) {
                    arr[6] = (int) Math.pow((Math.cbrt(arr[5]) + 1), 3);
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + " next number " + arr[6]);
                } else if (arr[7] == 0) {
                    arr[7] = (int) Math.pow((Math.cbrt(arr[6]) + 1), 3);
                    System.out.println("You entered the sequence: " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + "," + arr[6] + " next number " + arr[7]);
                }
            }
        } else System.out.println("Wrong");
    }
}
