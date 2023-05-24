package lesson2;

import java.util.Scanner;

public class Seminar {
    public static void main(String[] args) {
        // System.out.println(inputFloat());
        // int[] array = new int[] {1,2,3,4,5,6,7};
        // task2(array);
        // task3();
        System.out.println("Вы ввели: " + inputString());
        
    }

    
    public static void task2(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (NullPointerException e) {
            System.out.println("Массив null: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив слишком короткий: " + e);
        } 
    }
    public static void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.printf("Деление %d на %d равно %d\n", a,b,a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex) {
            System.out.println("Деление на 0!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws NullPointerException{
        System.out.println(a + b);
    }
    
    // Реализуйте метод, который запрашивает у пользователя ввод 
    // дробного числа (типа float), и возвращает введенное значение. 
    // Ввод текста вместо числа не должно приводить к падению приложения, 
    // вместо этого, необходимо повторно запросить у пользователя 
    // ввод данных.
    public static float inputFloat() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите дробное число: ");
            String res =  in.nextLine();
            float result = Float.valueOf(res);
            in.close();
            return result;
        } catch (Exception e) {
            System.out.println("Неверный формат ввода\nПопробуйте ещё раз!");
            return inputFloat();
        }
    }
    // Разработайте программу, которая выбросит Exception, 
    // когда пользователь вводит пустую строку. Пользователю должно 
    // показаться сообщение, что пустые строки вводить нельзя.
    public static String inputString() {
        try (Scanner in = new Scanner(System.in);) {
            System.out.print("Введите строку: ");
            
            String res =  in.nextLine();
            if (res != "") {
                in.close();
                return res;
            } else throw new Exception();
        } catch (Exception e) {
            System.out.println("\u001B[31m" + "Пустую строку вводить нельзя\nПопробуйте ещё раз!");
            return inputString();
        }
    }
}

 