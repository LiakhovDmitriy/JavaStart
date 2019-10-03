package A1.prog.kiev.Lesson8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OnLessonTwo {

    public static String loadStringFromFile(File file) {
        String text = "";
        try (Scanner sc = new Scanner(file)) {
            for (; sc.hasNextLine(); ) {
                text += sc.nextLine() + System.lineSeparator();
            }

        } catch (IOException e) {

        }
        return text;
    }

    public static void main(String[] args) {
        File file = new File("text.txt");
        String text = loadStringFromFile(file);
        System.out.println(text);
    }
}
