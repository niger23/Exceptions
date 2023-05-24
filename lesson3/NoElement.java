package lesson3;

public class NoElement extends IndexOutOfBoundsException{
    private String n;

    public NoElement (String message, Exception e) {
        super(message);
        n = "Вылезли за массив";
    }
    public String getInfo() {
        return n;
    }
}
