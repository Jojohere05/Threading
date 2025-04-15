public class ThreadThree {
    public void run() {
        printSquares();
    }
    public void printSquares() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Three - Square: " + (i * i));
            try {
                Thread.sleep(600); // pause for 600 ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}
