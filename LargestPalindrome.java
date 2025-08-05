package test1;
import java.util.*;
public class LargestPalindrome {
	 public static int minRemovalsToMakePalindrome(String input1) {
	        input1 = input1.toLowerCase();
	        Map<Character, Integer> freq = new HashMap<>();

	        for (char ch : input1.toCharArray()) {
	            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
	        }

	        int oddCount = 0;
	        for (int count : freq.values()) {
	            if (count % 2 != 0) {
	                oddCount++;
	            }
	        }

	        if (oddCount == input1.length()) {
	            return -1;
	        }

	        return Math.max(0, oddCount - 1);
	    }

	    public static void main(String[] args) {
	        System.out.println(minRemovalsToMakePalindrome("Template")); // Output: 3
	        System.out.println(minRemovalsToMakePalindrome("Magma"));    // Output: 0
	        System.out.println(minRemovalsToMakePalindrome("Victory"));  // Output: -1
	        System.out.println(minRemovalsToMakePalindrome("Malayalam"));// Output: 0
	    }


}
