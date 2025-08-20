package pgms;
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int count=0,candidate=0;
        for(int x:arr){
            if(count==0) candidate=x;
            count+=(x==candidate)?1:-1;
        }
        int freq=0;
        for(int x:arr) if(x==candidate) freq++;
        System.out.println(freq>n/2?candidate:"No Majority");
        sc.close();
    }
}
