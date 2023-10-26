package edu.wgu.d387_sample_code;

import internalization.TimezoneConversion;
import internalization.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

/**
 * Author: Stanton Barbadillo
 * Description: This class represents the main application for D387SampleCode, demonstrating multithreading and time zone conversion.
 */
@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		// Create threads for the Welcome Message in French and English
		WelcomeMessage welcomeMessageEnglish = new WelcomeMessage(Locale.US);
		Thread englishWelcomeThread = new Thread(welcomeMessageEnglish);
		englishWelcomeThread.start();

		WelcomeMessage welcomeMessageFrench = new WelcomeMessage(Locale.CANADA_FRENCH);
		Thread frenchWelcomeThread = new Thread(welcomeMessageFrench);
		frenchWelcomeThread.start();

		// Test time conversion
		System.out.println("Testing time conversion: " + TimezoneConversion.getTime());
	}
}
