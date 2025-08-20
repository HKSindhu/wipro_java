package pgms;
import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        k%=n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        for(int x:arr) System.out.print(x+" ");
        sc.close();
    }
    static void reverse(int[] arr,int l,int r){
        while(l<r){
            int t=arr[l]; arr[l]=arr[r]; arr[r]=t; l++; r--;
        }
    }
}
