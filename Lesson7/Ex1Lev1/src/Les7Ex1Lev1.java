import java.util.Calendar;
import java.util.Date;

public class Les7Ex1Lev1 {
    public static void main(String[] args) {
        /*
         * Написать программу которая вернет количество миллисекунд
         * прошедших от такого же числа, но в прошлом месяце до сегодняшней
         * даты. Например если сегодня 3 августа, то узнать сколько миллисекунд
         * прошло с 3 июля.
         */
        Date date1 = new Date();
        Calendar cal = Calendar.getInstance();
        System.out.println("Program start time " + date1 + "\n");
        Date date2;

        cal.add(Calendar.MONTH, - 1);
        date2 = cal.getTime();
        long n = date1.getTime() - date2.getTime();
        System.out.println(date1 + " minus " + date2 + " = " + n);
    }
}
