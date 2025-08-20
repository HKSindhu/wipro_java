package pgms;
import java.util.*;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int v=0,c=0;
        for(char ch:str.toCharArray()){
            if("aeiou".indexOf(ch)>=0) v++;
            else if(Character.isLetter(ch)) c++;
        }
        System.out.println("Vowels: "+v+", Consonants: "+c);
        sc.close();
    }
}
