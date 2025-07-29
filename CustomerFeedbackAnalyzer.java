package Customer;
import java.util.*;
import java.util.regex.*;

public class CustomerFeedbackAnalyzer {
	static List<String> feedbackList = new ArrayList<>();


	public static void main(String[] args) {
		 feedbackList.add("Great SERVICE! Very fast response. Email: john.doe@example.com");
	     feedbackList.add("Poor price options. Phone: 9876543210");
	     feedbackList.add("I love the support service. Email: jane@mail.com");

	     List<String> cleanedFeedback = cleanFeedback(feedbackList);
	     Map<String, Integer> wordCount = countWords(cleanedFeedback);
	     printWordOccurrences(wordCount, "service", "price");
	     printMostUsedWords(wordCount, 3);
	     printAverageLength(cleanedFeedback);
	}
	 static List<String> cleanFeedback(List<String> feedbacks) {
	        List<String> cleaned = new ArrayList<>();
	        for (String msg : feedbacks) {
	            msg = msg.toLowerCase();
	            msg = msg.replaceAll("[^a-z0-9@.\\s]", ""); // remove punctuation
	            msg = maskSensitiveInfo(msg);
	            cleaned.add(msg);
	        }
	        return cleaned;
	 }
	 static String maskSensitiveInfo(String text) {
	        // Mask email
	        text = text.replaceAll("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+", "***@***");
	        // Mask phone
	        text = text.replaceAll("\\b\\d{10}\\b", "**********");
	        return text;
	 }
	 static Map<String, Integer> countWords(List<String> feedbacks) {
	        Map<String, Integer> wordMap = new HashMap<>();
	        for (String msg : feedbacks) {
	            String[] words = msg.split("\\s+");
	            for (String word : words) {
	                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
	            }
	        }
	        return wordMap;
	 }
	 static void printWordOccurrences(Map<String, Integer> map, String... keywords) {
	        System.out.println("📌 Keyword Occurrences:");
	        for (String word : keywords) {
	            System.out.println(word + ": " + map.getOrDefault(word, 0));
	        }
	 }
	 static void printMostUsedWords(Map<String, Integer> map, int topN) {
	        System.out.println("\n📊 Most Used Words:");
	        map.entrySet().stream()
	            .sorted((a, b) -> b.getValue() - a.getValue())
	            .limit(topN)
	            .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
	 }
	 static void printAverageLength(List<String> feedbacks) {
	        int totalLength = 0;
	        for (String f : feedbacks) {
	            totalLength += f.split("\\s+").length;
	        }
	        double avg = (double) totalLength / feedbacks.size();
	        System.out.println("\n📈 Average Feedback Length: " + avg);
	 }
}
