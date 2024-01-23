import java.util.*;
public class Main {
    static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] x1 = new int[n];
        int [] x2 = new int[n];
        for(int i=0; i<n; i++){
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        result =0;
        for(int i=0; i<n; i++){
            for(int j =i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    count(n,i,j,k,x1,x2);
                }
            }
        }
        System.out.print(result);
    }
    public static void count(int n,int i, int j, int k, int[] x1, int [] x2){
        for(int l =0; l<n; l++){
            if(i==l||j==l||k==l) continue;
            for(int p=0; p<n; p++){
                if(l==p||p==j||p==i||p==k) continue;
                if(x2[l]<x1[p]) result++;
                if(n==4) result++;
            }
        }
    }
}