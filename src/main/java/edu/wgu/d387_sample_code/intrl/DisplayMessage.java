package edu.wgu.d387_sample_code.intrl;

import org.springframework.web.bind.annotation.CrossOrigin;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Author: Stanton Barbadillo
 * Description: This class provides methods for converting and formatting time in different time zones.
 */
public class DisplayMessage implements Runnable {
    private Locale locale;
    private String message;

    /**
     * Constructor for DisplayMessage.
     *
     * @param locale The locale for which the message should be displayed.
     */
    public DisplayMessage(Locale locale) {
        this.locale = locale;
    }

    /**
     * Gets the localized welcome message based on the provided locale.
     *
     * @return The localized welcome message.
     */
    public String getMessage() {
        if (message == null) {
            ResourceBundle bundle = ResourceBundle.getBundle("welcome", locale);
            message = bundle.getString("welcomeMessage");
        }
        return message;
    }

    @Override
    public void run() {
        System.out.println(getMessage());
    }
}
