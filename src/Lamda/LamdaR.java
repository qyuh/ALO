package Lamda;

public class LamdaR {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("R1");
            }
        };

        Runnable r2 = () -> System.out.println("R2");

        r1.run();
        r2.run();
    }
}
