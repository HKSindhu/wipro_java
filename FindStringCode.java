package lbPBL;
import java.util.Scanner;

public class FindStringCode {

    public int findStringCode(String input1) {
        String[] words = input1.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            word = word.toUpperCase();
            int sum = 0;
            int i = 0, j = word.length() - 1;

            while (i < j) {
                int pos1 = word.charAt(i) - 'A' + 1;
                int pos2 = word.charAt(j) - 'A' + 1;
                sum += Math.abs(pos1 - pos2);
                i++;
                j--;
            }

            if (i == j) { // middle letter for odd length
                sum += word.charAt(i) - 'A' + 1;
            }

            result.append(sum); // concatenate this word's sum
        }

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        FindStringCode obj = new FindStringCode();
        System.out.println(obj.findStringCode(input));
        sc.close();
    }
}
