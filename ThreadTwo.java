// This class demonstrates a thread that prints characters A to E
public class ThreadTwo extends Thread {
    public void run() {
        printCharacters();
    }
    // Function to print characters from A to E
    public void printCharacters() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Thread Two - Character: " + ch);
            try {
                Thread.sleep(700); // pause for 700 ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}