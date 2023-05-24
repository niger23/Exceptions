package lesson3;

import java.io.IOException;

public class Counter implements AutoCloseable{
    private int count;
    private boolean status = false;

    public void add() throws IOException{
        if (getStatus()) {
            count = this.count + 1;
            show();
        } else throw new IOException("Тут закрыто!");

            
    }
    private void show() {
        System.out.println(count);
    }
    public void open() {
        status = true;
    }
    @Override
    public void close(){
        status = false;
        System.out.println("закрыли!");
    }
    public boolean getStatus() {
        return this.status;
    }
    
}
