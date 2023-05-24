package lesson3.HomeWork;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeData(String data, String path) {
        System.out.println((char)27 + "[34mСоздана запись: " + path + (char)27 + "[0m");
        try(FileWriter fw = new FileWriter(path, true)) {
            fw.append(data);
            fw.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
