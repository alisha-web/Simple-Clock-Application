// BackgroundUpdater.java
public class BackgroundUpdater extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000); // Simulate a background task running every 5 seconds
                System.out.println("Background task updating...");
            } catch (InterruptedException e) {
                System.out.println("Background thread interrupted: " + e.getMessage());
            }
        }
    }
}
