package testethread;

public class TesteThread {

    public static void main(String[] args) {
        ThreadNormal x = new ThreadNormal();
        
        //x.run();
        
        new Runnable() {

            @Override
            public void run() {
                while(true) {
                    System.out.println("Oi da minha thread local!");
                }
            }
            
        }.run();
        
        
    }
    
}
