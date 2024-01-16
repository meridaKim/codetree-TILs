import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       int [][] arr = new int [n][n];
       for(int i=0; i<n; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int j =0; j<n; j++){
            arr[i][j]=Integer.parseInt(st.nextToken());
        }
       }
       int maxCount = Integer.MIN_VALUE;
       for(int i=0; i<n-1; i++){
        for(int j =0; j<n-2; j++){
            maxCount = Math.max(maxCount,arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2]);
        }
       }
       System.out.print(maxCount);
    }
}