// Clock.java
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {
    // Method to display the current time and date
    public void displayTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
        while (true) {
            Date date = new Date();
            synchronized(this) {
                System.out.println(formatter.format(date)); // Display time in a readable format
            }
            try {
                Thread.sleep(1000); // Sleep for 1 second to update time every second
            } catch (InterruptedException e) {
                System.out.println("Clock thread interrupted: " + e.getMessage());
            }
        }
    }
}
