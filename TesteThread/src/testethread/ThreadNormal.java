package testethread;

public class ThreadNormal implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("Oi da minha thread!");
        }
    }
    
}
