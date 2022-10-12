package practice;

import java.util.logging.Logger;

public class CountCapitalAndSmallLetters {

    private static final Logger LOGGER = Logger.getLogger(CountCapitalAndSmallLetters.class.getName());

    public static void main(String[] args) {
        String word = "AC123adfbbbc";
        LOGGER.info("Number of capital letters is: " + (word.replaceAll("[^A-Z]", "").length())
                + ", and number of small letters is: " + (word.replaceAll("[^a-z]", "").length()));
    }
}

