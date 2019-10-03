package A1.prog.kiev.Lesson7;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;


public class OnLesson {
    public static void main(String[] args) {

        Date date = new Date();
        // System.out.println(date);
       // SimpleDateFormat simp = new SimpleDateFormat("D Z H WW MMMM YYYY G ");
        SimpleDateFormat simp2 = new SimpleDateFormat("dd:MM:yyyy");
        String myDay = "16:10:1998";


        try {
            date = simp2.parse(myDay);
        }catch (ParseException e){
            System.out.println("Error");
        }
         String text = simp2.format(date);
         System.out.println(text);


    }
}
