package edu.wgu.d387_sample_code.intrl;

import org.springframework.web.bind.annotation.CrossOrigin;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Author: Stanton Barbadillo
 * Description: This class provides methods for converting and formatting time in different time zones.
 */
@CrossOrigin(origins = "http://localhost:4200")
public class TimeZoneConversion {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    /**
     * Converts a given time to multiple time zones and returns the formatted result.
     *
     * @return A string containing the time in Eastern Time (ET), Mountain Time (MT), and Coordinated Universal Time (UTC).
     */
    public static String convertTimeToAllZones() {
        String currentTime = "2023-05-18T16:00:00Z";
        ZonedDateTime currentZonedDateTime = ZonedDateTime.parse(currentTime);

        ZoneId etZone = ZoneId.of("America/New_York");
        ZoneId mtZone = ZoneId.of("America/Denver");
        ZoneId utcZone = ZoneId.of("UTC");

        ZonedDateTime etTime = currentZonedDateTime.withZoneSameInstant(etZone);
        ZonedDateTime mtTime = currentZonedDateTime.withZoneSameInstant(mtZone);
        ZonedDateTime utcTime = currentZonedDateTime.withZoneSameInstant(utcZone);

        String etTimeString = etTime.format(formatter);
        String mtTimeString = mtTime.format(formatter);
        String utcTimeString = utcTime.format(formatter);

        return etTimeString + " ET, " +  mtTimeString + " MT, "  + utcTimeString + " UTC";
    }
}
