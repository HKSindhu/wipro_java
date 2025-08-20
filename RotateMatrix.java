package pgms;
import java.util.*;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] mat=new int[n][n];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) mat[i][j]=sc.nextInt();
        for(int i=0;i<n;i++)
            for(int j=i;j<n;j++){
                int t=mat[i][j]; mat[i][j]=mat[j][i]; mat[j][i]=t;
            }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int t=mat[i][j]; mat[i][j]=mat[i][n-1-j]; mat[i][n-1-j]=t;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) System.out.print(mat[i][j]+" ");
            System.out.println();
            sc.close();
        }
    }
}

