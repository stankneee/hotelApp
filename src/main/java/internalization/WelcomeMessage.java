package internalization;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Author: Stanton Barbadillo
 * Description: This class provides a welcome message based on the specified Locale.
 */
public class WelcomeMessage implements Runnable {

    Locale locale;

    // Constructor that takes a Locale parameter
    public WelcomeMessage(Locale locale) {
        this.locale = locale;
    }

    // Method to retrieve the welcome message based on the provided Locale
    public String getWelcomeMessage() {
        ResourceBundle bundle = ResourceBundle.getBundle("translation", locale);
        return bundle.getString("welcome");
    }

    @Override
    public void run() {
        // Display a welcome message along with thread information
        System.out.println("Thread verification: " + getWelcomeMessage() + ", ThreadID: " + Thread.currentThread().getId());
    }
}
