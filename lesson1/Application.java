package lesson1;


public class Application {
    public static void main(String[] args) {
        System.out.println(divide(10,0));
    }

    public static int divide(int a1,int a2){
        if(a2==0){
            throw new RuntimeException("Деление на 0");
        }
        return a1/a2;
    }

}
