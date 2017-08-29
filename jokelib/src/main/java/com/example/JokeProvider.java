package com.example;

public class JokeProvider {
    private static String[] jokes = {
            "test joke 1",
            "test joke 2"
    };

    public static String getJoke() {
        return jokes[0];
      //  return "";
    }
}
