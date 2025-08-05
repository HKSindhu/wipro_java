package test1;
import java.util.*;

public class PossibleWordsFinder {

    public static String identifyPossibleWords(String input1, String input2) {
        input1 = input1.trim().toLowerCase();
        String[] candidates = input2.split(":");
        List<String> matchedWords = new ArrayList<>();

        for (String word : candidates) {
            String trimmedWord = word.trim().toLowerCase();
            if (trimmedWord.length() != input1.length()) {
                continue;
            }

            boolean match = true;
            for (int i = 0; i < input1.length(); i++) {
                char c = input1.charAt(i);
                if (c != '_' && c != trimmedWord.charAt(i)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                matchedWords.add(trimmedWord.toUpperCase());
            }
        }

        if (matchedWords.isEmpty()) {
            return "ERROR-009";
        }

        return String.join(" ", matchedWords);
    }

    public static void main(String[] args) {
        String input1 = "Fi_er";
        String input2 = "Fever:filer:Filter: Fixer:fiber:fibre:tailor:offer";
        String result = identifyPossibleWords(input1, input2);
        System.out.println(result);
    }
}