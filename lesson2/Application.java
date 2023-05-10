package lesson2;

import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("test");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getClass().getSimpleName());
        } finally {
            if (test != null){
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("ошибка закрытия");
                }
            }
        }
    }
    
}
