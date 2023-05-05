package lesson1;

import java.util.Arrays;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
// необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, 
// которое пользователь может увидеть - RuntimeException, т.е. ваше.


public class HomeWork {
    public static void main(String[] args) {
        int [] arr1 = new int [] {15,25,35,45,55,65};
        int [] arr2 = new int [] {3,10,5,6,1,10};
        System.out.println(Arrays.toString(difference(arr1, arr2)));
        System.out.println(Arrays.toString(divide(arr1, arr2)));
    }

    public static int [] difference(int [] arr1, int [] arr2) {
        try {
            if (arr1 == null || arr2 == null) throw new RuntimeException("0");
            else if (arr1.length != arr2.length) throw new RuntimeException("1");
            else {
                int [] res = new int[arr1.length];
                for (int i = 0; i < res.length; i++) {
                    res[i] = arr1[i] - arr2[i];
                }
                return res;
            }
            
        } catch (Exception e) {
            System.out.println(e);
                if(e.getMessage() == "0") System.out.println("Присутствует массив null");
                if(e.getMessage() == "1") System.out.println("Длина массивов не равна");
            System.out.println("Разность массивов не выполнена!");
            return null;
        }
    }

    public static double [] divide(int [] arr1, int [] arr2) {
        try {
            if (arr1 == null || arr2 == null) throw new RuntimeException("0");
            else if (arr1.length != arr2.length) throw new RuntimeException("1");
            else {
                double [] res = new double[arr1.length];
                for (int i = 0; i < res.length; i++) {
                    if(arr2[i] == 0) {
                        String posNull = "";
                        for (int j = 0; j < res.length; j++) {
                            if (arr2[j] == 0) posNull = posNull + " " + j;
                        }
                        throw new RuntimeException(posNull);
                    }
                    res[i] = (double) arr1[i]/arr2[i];
                }
                return res;
            }
        } catch (Exception e) {
            System.out.println(e);
                if(e.getMessage() == "0") System.out.println("Присутствует массив null");
                else if(e.getMessage() == "1") System.out.println("Длина массивов не равна");
                else System.out.printf("Среди делителей есть 0, на позициях: %s\n", e.getMessage());
            System.out.println("Деление массивов не выполнено!");
            return null;
        }
    }
}
