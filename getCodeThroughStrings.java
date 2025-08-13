package lbPBL;

import java.util.Scanner;

public class getCodeThroughStrings {

    public int GetCodeThroughStrings(String input1) {
        // Split the sentence into words
        String[] words = input1.split("\\s+");
        int totalLength = 0;

        // Add lengths of all words
        for (String word : words) {
            totalLength += word.length();
        }

        // Keep summing digits until a single digit remains
        while (totalLength > 9) {
            int sum = 0;
            while (totalLength > 0) {
                sum += totalLength % 10;
                totalLength /= 10;
            }
            totalLength = sum;
        }

        return totalLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        getCodeThroughStrings obj = new getCodeThroughStrings();
        int result = obj.GetCodeThroughStrings(input);
        System.out.println("Code: " + result);

        sc.close();
    }
}
