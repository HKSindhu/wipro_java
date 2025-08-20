package pgms;
import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        StringBuilder res = new StringBuilder();
        for (String w : words) res.append(new StringBuilder(w).reverse()).append(" ");
        System.out.println(res.toString().trim());
        sc.close();
    }
}
