package lesson1;

import java.util.Scanner;

public class Seminar {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 0, null, 1, 1,null};
        System.out.println(checkArray(arr));
        
    }

    // Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
    // Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
    public static int lengthArray(int [] array) {
        if (array.length < 5){
            return -1;
        }
        return array.length;
    }
// Реализуйте метод, принимающий в качестве аргумента 
// целочисленный массив и некоторое значение. Метод ищет 
// в массиве заданное значение и возвращает его индекс. 
// При этом, например:
// если длина массива меньше некоторого заданного минимума, 
// метод возвращает -1, в качестве кода ошибки.
// если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
// если вместо массива пришел null, метод вернет -3
// придумайте свои варианты исключительных ситуаций и верните 
// соответствующие коды ошибок.
// Напишите метод, в котором реализуйте взаимодействие с пользователем. 
// То есть, этот метод запросит искомое число у пользователя, вызовет 
// первый, обработает возвращенное значение и покажет читаемый результат 
// пользователю. Например, если вернулся -2, пользователю выведется 
// сообщение: “Искомый элемент не найден”.
    public static int find(int[] arr, int find) {
        if (arr == null) return -3;
        else if (arr.length < 5) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) return i;
        }
        return -2;
    }

    public static void app(int[] arr) {
        try 
            (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите искомое число: ");
            int find = in.nextInt();
            int result = find(arr,find);
            if (result == -1) System.out.println("Массив меньше необходимого размера");
            else if ((result == -2)) System.out.println("Элемент не найден");
            else if ((result == -3)) System.out.println("Массив null");
            else System.out.printf("Искомое число находится под индексом: %d", result);

        } 
        catch (Exception e) {
            System.out.println("Введено не число");
        }
    }

// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
// Необходимо посчитать и вернуть сумму элементов этого массива.
// При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
// Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
    public static int sum(int[][] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) throw new RuntimeException("Массив не квадратный");
            else {
                for (int j = 0; j < arr.length; j++) {
                    if (!(arr[i][j] == 0 || arr[i][j] == 1)) throw new RuntimeException("В массиве есть значения отличные от 0 и 1");
                    else result += arr[i][j];
                }
            }
        }
        return result;
    }
    // Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
    // Метод должен пройтись по каждому элементу и проверить что он не равен null.
    // А теперь реализуйте следующую логику (через коды ошибок или исключения):
    // Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
    // Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
    public static boolean checkArray(Integer[] arr) {
        String a = "";
        try {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == null) {
                    a = a + " " + i;
                }
            }
            if(a != "") throw new RuntimeException(a);
            else return true;
        } catch (RuntimeException e) {
            System.out.printf("Обнаружен null на позициях: %s\n",a);
            return false;
        }
        
    }
}

