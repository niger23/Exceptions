package lesson3;

public class NoNull extends ArithmeticException{
    private String n;

    public NoNull (String message, Exception e) {
        super(message);
        n = "Всё...";
    }
    public String getInfo() {
        return n;
    }
}
