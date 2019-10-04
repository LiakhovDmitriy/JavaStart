package A1.prog.kiev.Lesson8;

import java.io.File;
import java.io.IOException;

public class Les8ExOnLesson2 {
    public static void main(String[] args) {

        File workFolder = new File(".");

        File file1 = new File("file1.txt");

        try {
            file1.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }

        File[] files = workFolder.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}
