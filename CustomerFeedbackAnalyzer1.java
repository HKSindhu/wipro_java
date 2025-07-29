package Customer;
import java.util.*;
import java.util.regex.*;

public class CustomerFeedbackAnalyzer1 {
    static List<String> feedbackList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("\n📋 Menu:");
            System.out.println("1. Add Feedback");
            System.out.println("2. View All Feedback");
            System.out.println("3. Clean Feedback");
            System.out.println("4. Mask Sensitive Info");
            System.out.println("5. Keyword Count");
            System.out.println("6. Summary Report");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = sc.nextInt();
                sc.nextLine(); // consume newline
                switch (choice) {
                    case 1: addFeedback(); break;
                    case 2: viewFeedback(); break;
                    case 3: cleanAllFeedback(); break;
                    case 4: maskAllFeedback(); break;
                    case 5: keywordCount(); break;
                    case 6: summaryReport(); break;
                    case 0: System.exit(0);
                    default: System.out.println("Invalid choice. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // clear invalid input
            }
        }
    }

    static void addFeedback() {
        System.out.print("Enter feedback: ");
        String input = sc.nextLine();
        feedbackList.add(input);
        System.out.println("Feedback added successfully.");
    }

    static void viewFeedback() {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback available.");
            return;
        }
        for (int i = 0; i < feedbackList.size(); i++) {
            System.out.println((i + 1) + ". " + feedbackList.get(i));
        }
    }

    static void cleanAllFeedback() {
        List<String> cleaned = new ArrayList<>();
        for (String f : feedbackList) {
            String c = f.trim().replaceAll("[^a-zA-Z0-9@.\\s]", "");
            cleaned.add(c);
        }
        feedbackList = cleaned;
        System.out.println("Feedback cleaned.");
    }

    static void maskAllFeedback() {
        List<String> masked = new ArrayList<>();
        for (String f : feedbackList) {
            String m = f.replaceAll("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+", "[EMAIL]");
            m = m.replaceAll("\\b\\d{10}\\b", "[PHONE]");
            masked.add(m);
        }
        feedbackList = masked;
        System.out.println("Sensitive info masked.");
    }

    static void keywordCount() {
        System.out.print("Enter keyword to search: ");
        String keyword = sc.nextLine().toLowerCase();
        int count = 0;
        for (String f : feedbackList) {
            count += countOccurrences(f.toLowerCase(), keyword);
        }
        System.out.println("Keyword \"" + keyword + "\" found " + count + " time(s).");
    }

    static int countOccurrences(String text, String keyword) {
        int count = 0;
        for (String word : text.split("\\s+")) {
            if (word.equalsIgnoreCase(keyword)) {
                count++;
            }
        }
        return count;
    }

    static void summaryReport() {
        int total = feedbackList.size();
        if (total == 0) {
            System.out.println("Total Feedbacks: 0, Avg: 0, Max: 0, Min: 0");
            return;
        }

        int sum = 0, max = 0, min = Integer.MAX_VALUE;
        for (String f : feedbackList) {
            int len = f.split("\\s+").length;
            sum += len;
            max = Math.max(max, len);
            min = Math.min(min, len);
        }
        System.out.println("Total: " + total + ", Avg: " + (sum / total) + ", Max: " + max + ", Min: " + min);
    }
}
