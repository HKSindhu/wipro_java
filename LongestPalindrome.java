package pgms;
import java.util.*;

public class LongestPalindrome {
    static String expand(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){ l--; r++; }
        return s.substring(l+1,r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(), res="";
        for(int i=0;i<s.length();i++){
            String p1=expand(s,i,i);
            if(p1.length()>res.length()) res=p1;
            String p2=expand(s,i,i+1);
            if(p2.length()>res.length()) res=p2;
        }
        System.out.println(res);
        sc.close();
    }
}

