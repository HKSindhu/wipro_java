package logicalbuilding;
public class JumbledWords {

    public static String jumbleSentence(String input1, int input2) {
        String[] words = input1.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String jumbledWord;
            if (input2 == 1) {
                jumbledWord = method1(word);
            } else if (input2 == 2) {
                jumbledWord = method2(word);
            } else {
                throw new IllegalArgumentException("Invalid method type: " + input2);
            }
            result.append(jumbledWord).append(" ");
        }

        return result.toString().trim();
    }

 
    private static String method1(String word) {
        StringBuilder oddForward = new StringBuilder();
        StringBuilder evenBackward = new StringBuilder();
        
        for (int i = 0; i < word.length(); i += 2) {
            oddForward.append(word.charAt(i));
        }

        for (int i = word.length() - 1; i >= 0; i--) {
            if (i % 2 != 0) { 
                evenBackward.append(word.charAt(i));
            }
        }

        return oddForward.append(evenBackward).toString();
    }

    // Method-2 (forward, forward)
    private static String method2(String word) {
        StringBuilder oddForward = new StringBuilder();
        StringBuilder evenForward = new StringBuilder();
        
        for (int i = 0; i < word.length(); i += 2) {
            oddForward.append(word.charAt(i));
        }
        for (int i = 1; i < word.length(); i += 2) {
            evenForward.append(word.charAt(i));
        }

        return oddForward.append(evenForward).toString();
    }
    public static void main(String[] args) {
        String sentence = "PROJECT BASED LEARNING";
        
        System.out.println(jumbleSentence(sentence, 1)); 
        System.out.println(jumbleSentence(sentence, 2)); 
    }
}

