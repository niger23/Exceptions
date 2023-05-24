package lesson3.HomeWork;

public class DataException extends Exception{
    private String n;

    public DataException (String message, int e) {
        super(message);
        if (e == 111) n = (char)27 + "[31mГендер может быть только f или m" + (char)27 + "[0m";
        else if (e == 112) n = (char)27 + "[31mДата только в формате dd.mm.yyyy" + (char)27 + "[0m";
        else if (e == 113) n = (char)27 + "[31mНомер должен содержать только цифры" + (char)27 + "[0m";
        else if (e == 114) n = (char)27 + "[31mОшибка в наборе данных" + (char)27 + "[0m";
        
    }
    public String getInfo() {
        return n;
    }
}
