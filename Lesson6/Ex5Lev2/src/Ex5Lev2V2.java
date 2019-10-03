package A1.prog.kiev.Lesson6;

import java.util.Scanner;

public class Ex5Lev2V2 {
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
        String[] arr = line.split("[,]");
        if (4 <= arr.length && arr.length <= 7) {
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            int d = Integer.parseInt(arr[3]);
            int e = 0;
            int g = 0;
            int k = 0;
            int l = 0;
            if (arr.length >= 5) {
                e = Integer.parseInt(arr[4]);
            }
            if (arr.length >= 6) {
                g = Integer.parseInt(arr[5]);
            }
            if (arr.length >= 7) {
                k = Integer.parseInt(arr[6]);
            }
            int count;
            if (b - a == b && c - b == b && d - c == b) {
                count = b - a;
                if (e == 0) {
                    e = d + count;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + " next number " + e);
                } else if (g == 0) {
                    g = e + count;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + " next number " + g);
                } else if (k == 0) {
                    k = g + count;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + "," + g + " next number " + k);
                } else if (l == 0) {
                    l = k + count;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + "," + g + "," + k + " next number " + l);
                }
            } else if (b - a == c - b && d - c == c - b) { //a1,b4,c7,d10,e13
                count = b - a;
                if (e == 0) {
                    e = d + count;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + " next number " + e);
                } else if (g == 0) {
                    g = e + count;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + " next number " + g);
                } else if (k == 0) {
                    k = g + count;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + "," + g + " next number " + k);
                } else if (l == 0) {
                    l = k + count;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + "," + g + "," + k + " next number " + l);
                }
            } else if (b * 2 == c && c * 2 == d) { //a1,b2,c4,d8,e16,g32
                if (e == 0) {
                    e = d * 2;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + " next number " + e);
                } else if (g == 0) {
                    g = e * 2;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + " next number " + g);
                } else if (k == 0) {
                    k = g * 2;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + "," + g + " next number " + k);
                } else if (l == 0) {
                    l = k * 2;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + "," + g + "," + k + " next number " + l);
                }
            } else if (a * b == b && b * b == c && c * b == d) { //a1,b3,c9,d27 e g k
                if (e == 0) {
                    e = d * b;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + " next number " + e);
                } else if (g == 0) {
                    g = e * b;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + " next number " + g);
                } else if (k == 0) {
                    k = g * b;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + "," + g + " next number " + k);
                } else if (l == 0) {
                    l = k * b;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + "," + g + "," + k + " next number " + l);
                }
            } else if ((b - a == ((c - b) - 2) && ((c - b) == ((d - c) - 2)))) { //a1,b4,c9,d16,e25
                if (e == 0) {
                    e = d + (d - c) + 2;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + " next number " + e);
                } else if (g == 0) {
                    g = e + (e - d) + 2;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + " next number " + g);
                } else if (k == 0) {
                    k = g + (g - e) + 2;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + "," + g + " next number " + k);
                } else if(l==0){
                    l=k+(k-g)+2;
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + "," + g + "," + k + " next number " + l);
                }
            } else if (Math.cbrt(b) == Math.cbrt(c) - 1 && Math.cbrt(c) == Math.cbrt(d) - 1) {//a1,b8,c27,d64,e125
                if (e == 0) {
                    e = (int) Math.pow((Math.cbrt(d) + 1), 3);
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + " next number " + e);
                } else if (g == 0) {
                    g = (int) Math.pow((Math.cbrt(e) + 1), 3);
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + " next number " + g);
                } else if (k == 0) {
                    k = (int) Math.pow((Math.cbrt(g) + 1), 3);
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + "," + g + " next number " + k);
                } else if(l==0){
                    l=(int) Math.pow((Math.cbrt(k) + 1), 3);
                    System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + "," + g + "," + k + " next number " + l);
                }
            }
        } else System.out.println("Wrong");
    }
}
