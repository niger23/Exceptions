package lesson3.HomeWork;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        try (Scanner iScanner = new Scanner(System.in)) {
            while (true){
                System.out.println("Введите через ПРОБЕЛ информацию в формате:\nФамилия Имя Отчество дата_рождения(dd.mm.yyyy) номер_телефона(только цифры) пол(f/m): ");
                String data = iScanner.nextLine();
                String[] arrayData = data.split(" ");
                if (arrayData.length == 6) {
                    return arrayData;
                } else if (arrayData.length < 6){
                    System.out.println((char)27 + "[31mДанных не хватает, попробуйте снова!" + (char)27 + "[0m");
                } else System.out.println((char)27 + "[31mДанных больше, чем нужно, повторим!" + (char)27 + "[0m");
            }
        } catch (Exception e) {
            return null;
        }
    }
}
