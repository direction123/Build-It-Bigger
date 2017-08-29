package com.example;

import java.util.Random;

public class JokeProvider {
    private static String[] jokes = {
            "A SQL query goes into a bar, walks up to two tables and asks, \"Can I join you?\"",
            "A computer science student is studying under a tree and another pulls up on a flashy new bike. " +
                    "The first student asks, \"Where’d you get that?\"\n" +
                    "\n" +
                    "The student on the bike replies, \"While I was studying outside, a beautiful girl pulled up on her bike. " +
                    "She took off all her clothes and said, 'You can have anything you want'.\"\n" +
                    "\n" +
                    "The first student responds, \"Good choice! Her clothes probably wouldn't have fit you.\"",
            "Q: \"Whats the object-oriented way to become wealthy?\"\n" +
                    "\n" +
                    "A: Inheritance"
    };

    public static String getJoke() {
        Random r = new Random();
        int low = 0;
        int high = jokes.length;
        int index = r.nextInt(high-low) + low;  // [low, high)

        return jokes[index];
    }
}
