public class ThreadTwo extends Thread {
    public void run() {
        printCharacters();
    }
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