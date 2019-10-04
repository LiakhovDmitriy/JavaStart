import java.util.Scanner;

public class Les2Ex1Lev1 {
    public static void main(String[] args) {
        /*
         * Написать програму которая считывает 5-и значное число с
         * клавиатуры и выводит цыфры из которого оно состоит в столбец.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5-digit number on your keyboard. Then press \"Enter\" ");
        for (; ; ) {
            int number = sc.nextInt(); //Считываем число с клавиатуры.

            if (9999 < number && 100000 > number) { //Убираем все остальные не 5 значные числа
                System.out.println(number / 10000);                          //Выводит первое число
                System.out.println((number % 10000) / 1000);                 //Выводит второе число
                System.out.println((number % 10000) % 1000 / 100);           //Выводит третье число
                System.out.println((number % 10000) % 1000 % 100 / 10);      //Выводит четвертое число
                System.out.println((number % 10000) % 1000 % 100 % 10);      //Выводит пятое число
                break;
            } else System.out.println("You entered not 5-digit number, try again please ");
        }
    }
}
