import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int [] x1 = new int[n];
       int [] x2 = new int[n];
       for(int i=0; i<n; i++){
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
       }
        int result = Integer.MIN_VALUE;
       for(int i=0; i<n; i++){
        int [] count = new int[1001];
        int time =0;
        for(int j =0; j<n; j++){
            if(i==j) continue;
            for(int k=x1[j]; k<x2[j]; k++){
                count[k]=1;
            }
        }
        for(int l =0; l<count.length; l++){
                if(count[l]==1){
                    time++;
                }
            }
        result = Math.max(time, result);
       }
       System.out.print(result);
    }
}