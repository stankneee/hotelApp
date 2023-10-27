package internalization;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TimezoneConversionController {

    @GetMapping("/presentation")
    public ResponseEntity<String> displayPresentation() {
        String announcement = "Live Presentation beginning at: " + TimezoneConversion.getTime();
        return new ResponseEntity<String> (announcement, HttpStatus.OK);
    }
}

