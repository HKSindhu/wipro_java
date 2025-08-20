package pgms;
import java.util.*;

public class SubarraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), target=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int sum=0,l=0;
        for(int r=0;r<n;r++){
            sum+=arr[r];
            while(sum>target) sum-=arr[l++];
            if(sum==target){
                System.out.println(l+" "+r);
                return;
            }
        }
        System.out.println("No subarray");
        sc.close();
    }
}

