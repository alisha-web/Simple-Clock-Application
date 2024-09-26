// Main.java
public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();

        // Create and start the clock thread with high priority
        ClockThread clockThread = new ClockThread(clock);
        clockThread.setPriority(Thread.MAX_PRIORITY);

        // Create and start the background thread with low priority
        BackgroundUpdater backgroundThread = new BackgroundUpdater();
        backgroundThread.setPriority(Thread.MIN_PRIORITY);

        // Start both threads
        clockThread.start();
        backgroundThread.start();
    }
}
