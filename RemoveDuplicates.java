package pgms;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(char ch:str.toCharArray()){
            if(!set.contains(ch)){ set.add(ch); sb.append(ch); }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}

