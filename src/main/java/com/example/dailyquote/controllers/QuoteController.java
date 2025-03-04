package com.example.dailyquote.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {
    private final List<String> quotes = List.of(
            "The only way to do great work is to love what you do. - Steve Jobs",
            "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
            "Believe you can and you're halfway there. - Theodore Roosevelt",
            "Life is what happens when you're busy making other plans. - John Lennon",
            "Your time is limited, so don't waste it living someone else's life. - Steve Jobs",
            "Success is not final, failure is not fatal: It is the courage to continue that counts.",
            "Believe you can and you're halfway there.",
            "The only way to do great work is to love what you do.",
            "You miss 100% of the shots you don't take.",
            "Don't watch the clock; do what it does. Keep going."
    );

    private final Random random = new Random();

    @GetMapping("/quote")
    public String getQuoteOfTheDay() {
        int index = random.nextInt(quotes.size());
        return quotes.get(index);
    }

}
