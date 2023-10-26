package internalization;

import org.springframework.web.bind.annotation.CrossOrigin;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Author: Stanton Barbadillo
 * Description: This class provides methods for converting and formatting time in different time zones.
 */
@CrossOrigin(origins = "http://localhost:4200")
public class TimezoneConversion {

    public static String getTime() {
        ZonedDateTime time = ZonedDateTime.now();
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");

        ZonedDateTime est = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime mst = time.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime utc = time.withZoneSameInstant(ZoneId.of("UTC"));

        String times = est.format(timeFormat) + " EST, " + mst.format(timeFormat) + " MST, " + utc.format(timeFormat) + " UTC";

        return times;
    }
}
