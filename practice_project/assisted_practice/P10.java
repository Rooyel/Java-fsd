package practice_project.assisted_practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P10 {

    public static void main(String[] args) {
        // Sample string
        String text = "The quick brown fox jumps over the lazy dog.";

        // Regular expression pattern
        String regex = "fox";

        // Creating a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Creating a Matcher object
        Matcher matcher = pattern.matcher(text);

        // Finding the first occurrence of the pattern in the text
        if (matcher.find()) {
            System.out.println("Pattern found at index " + matcher.start());
        } else {
            System.out.println("Pattern not found.");
        }

        // Matching the entire text against the pattern
        boolean matches = text.matches(".*lazy.*");
        if (matches) {
            System.out.println("Text contains the word 'lazy'.");
        } else {
            System.out.println("Text does not contain the word 'lazy'.");
        }
    }
}
