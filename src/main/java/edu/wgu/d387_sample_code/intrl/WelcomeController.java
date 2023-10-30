package edu.wgu.d387_sample_code.intrl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * Author: Stanton Barbadillo
 * Description: This REST controller provides an API endpoint for retrieving welcome messages in different languages.
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class WelcomeController {

    /**
     * Endpoint for retrieving welcome messages in different languages.
     *
     * @param language The language tag for the desired language.
     * @return A ResponseEntity containing the welcome message in the specified language.
     */
    @GetMapping("/welcome")
    public ResponseEntity<String> getWelcomeMessage(@RequestParam("lang") String language) {
        Locale locale = Locale.forLanguageTag(language);
        DisplayMessage displayMessage = new DisplayMessage(locale);
        String message = displayMessage.getMessage();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
