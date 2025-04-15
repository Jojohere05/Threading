public class ThreadOne extends Thread {
    public void run() {
        printNumbers();
    }
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