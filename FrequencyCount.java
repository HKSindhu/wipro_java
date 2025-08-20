package pgms;
import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:arr) map.put(x,map.getOrDefault(x,0)+1);
        for(Map.Entry<Integer,Integer> e:map.entrySet())
            System.out.println(e.getKey()+" -> "+e.getValue());
        sc.close();
    }
}

