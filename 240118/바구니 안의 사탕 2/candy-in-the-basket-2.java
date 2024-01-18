import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       st = new StringTokenizer(br.readLine());
       int n = Integer.parseInt(st.nextToken());
       int k = Integer.parseInt(st.nextToken());
       int [] arr = new int [101];
       int end =0;
       for(int i =0; i<n; i++){
         st = new StringTokenizer(br.readLine());
         int candy = Integer.parseInt(st.nextToken());
         int location = Integer.parseInt(st.nextToken());
         end = Math.max(end, location);
         arr[location] = candy;
       }
       int sum;
       int max = 0;
      for(int i= 0; i<arr.length; i++){
        sum=0;
        for(int j =i-k; j<=i+k; j++){
            if(i-k>0&&i+k<=100){
             sum+=arr[j];
        }
            }
        max = Math.max(sum,max);
      }
       System.out.print(max);
    }
}