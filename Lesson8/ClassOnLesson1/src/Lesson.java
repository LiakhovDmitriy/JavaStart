package A1.prog.kiev.Lesson8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lesson {
    public static void saveReport(String[] goods, int[] prise, int[] count, File file, String delimetr) {
        try (PrintWriter pw = new PrintWriter(file)) {
            for (int i = 0; i < goods.length; i++) {
                pw.println(goods[i] + delimetr + prise[i] + delimetr + count[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String[] goods = new String[]{"Snickers", "Baunti", "Coca-cola", "Tea", "Sprite"};

        int[] prices = new int[]{15, 12, 20, 20, 18};
        int[] count = new int[]{300, 250, 200, 150, 180};
        File file = new File("report.csv");
        saveReport(goods,prices,count,file,";");



    }
}
