package lesson2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("test");
            FileWriter writer = new FileWriter("test")) {
            while (reader.ready()) {
                writer.write(reader.read()); 
            }
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getClass().getSimpleName());
        } 
        System.out.println("Complete");
    }
    
}
