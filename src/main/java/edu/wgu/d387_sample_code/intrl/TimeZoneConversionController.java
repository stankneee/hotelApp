package edu.wgu.d387_sample_code.intrl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Stanton Barbadillo
 * Description: This REST controller provides an API endpoint for converting and retrieving times in different time zones.
 */
@RestController
@RequestMapping("/api/time")
@CrossOrigin(origins = "http://localhost:4200")
public class TimeZoneConversionController {

    /**
     * Endpoint for converting and retrieving times in different time zones.
     *
     * @return A string containing the time in Eastern Time (ET), Mountain Time (MT), and Coordinated Universal Time (UTC).
     */
    @GetMapping("/convert")
    public String convertTimeZone() {
        return TimeZoneConversion.convertTimeToAllZones();
    }
}
