package lesson3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Создайте метод doSomething(), который может быть 
// источником одного из типов checked exceptions 
// (тело самого метода прописывать не обязательно). 
// Вызовите этот метод из main и обработайте в нем исключение, 
// которое вызвал метод doSomething().

public class Seminar {
    public static void main(String[] args) throws NoNull {

        // try {
        //     try {
        //         // int i = 10/0;
        //         int [] newArr = new int [] {0,1};
        //         newArr[3] = 0;
        //     } catch (ArithmeticException e) {
        //         throw new NoNull("Деление на ноль запрещено",e);
        //     }catch (IndexOutOfBoundsException e) {
        //         throw new NoElement("Переполнили индекс",e);
        //     }
        // } catch (NoNull e) {
        //     System.out.println(e.getInfo());
        // } catch (NoElement e) {
        //     System.out.println(e.getInfo());
        // }
        //     doSomething();
        // } catch (IOException e) {
        //     System.out.println("Поймали! \n" + e.getClass().getSimpleName());
        // }
        // try (Counter count = new Counter()) {
        //     count.open();
        //     count.add();
        //     count.add();
        //     count.add();
        // } catch (IOException e) {
        //     e.printStackTrace();
        //     System.out.println("Поймали!");
        // }

    }

    public static void doSomething() throws IOException{
        throw new IOException();
        
    }

    public void rwLine(Path pathRead, Path pathWrite) throws IOException {

        try (BufferedReader in = Files.newBufferedReader (pathRead);
            BufferedWriter out = Files.newBufferedWriter(pathWrite);) {
            out.write(in.readLine());
        } 
    }
    // Создайте класс Счетчик, у которого есть метод add(), 
    // увеличивающий значение внутренней int переменной на 1. 
    // Сделайте так, чтобы с объектом такого типа можно было 
    // работать в блоке try-with-resources. Подумайте, что должно 
    // происходить при закрытии этого ресурса? Напишите метод для 
    // проверки, закрыт ли ресурс. При попытке вызвать add() 
    // у закрытого ресурса, должен выброситься IOException


// 1. Создайте класс исключения, который будет выбрасываться 
// при делении на 0. Исключение должно отображать понятное для 
// пользователя сообщение об ошибке.

// 2. Создайте класс исключений, которое будет возникать 
// при обращении к пустому элементу в массиве ссылочного типа. 
// Исключение должно отображать понятное для пользователя 
// сообщение об ошибке.

// 3. Создайте класс исключения, которое будет возникать 
// при попытке открыть несуществующий файл. Исключение должно 
// отображать понятное для пользователя сообщение об ошибке.

}
