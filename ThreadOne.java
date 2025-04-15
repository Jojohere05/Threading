// This class demonstrates a thread that prints numbers 1 to 5
public class ThreadOne extends Thread {
    public void run() {
        printNumbers();
    }
    // Function to print numbers from 1 to 5
    public void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread One - Number: " + i);
            try {
                Thread.sleep(500); // pause for 500 ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}