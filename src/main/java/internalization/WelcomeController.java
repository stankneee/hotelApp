package internalization;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * Author: Stanton Barbadillo
 * Description: This class represents a REST controller for handling welcome messages in different languages.
 */
@CrossOrigin(origins = "http://localhost:4200") // Needed for front end
@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public ResponseEntity<String> displayWelcome(@RequestParam("lang") String lang) { // Request the html lang parameter here
        Locale locale = Locale.forLanguageTag(lang); // create a locale object based on the lang parameter
        WelcomeMessage welcomeMessage = new WelcomeMessage(locale); // create a welcomeMessage to pull the corresponding language
        return new ResponseEntity<String>(welcomeMessage.getWelcomeMessage(), HttpStatus.OK); // respond
    }
}
