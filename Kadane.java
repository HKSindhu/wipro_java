package pgms;
import java.util.*;

public class Kadane {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int maxSoFar=arr[0], maxEnding=arr[0];
        for(int i=1;i<n;i++){
            maxEnding=Math.max(arr[i],maxEnding+arr[i]);
            maxSoFar=Math.max(maxSoFar,maxEnding);
        }
        System.out.println(maxSoFar);
        sc.close();
    }
}

