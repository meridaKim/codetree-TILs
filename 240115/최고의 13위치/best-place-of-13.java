import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] arr = new int [n][n];
        StringTokenizer st;
        for(int i = 0; i<n; i++){
            st =new StringTokenizer(br.readLine());
            for(int j =0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int mCount = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            for(int j =0; j<n-2; j++){
                mCount=Math.max(arr[i][j]+arr[i][j+1]+arr[i][j+2], mCount);
            }
        }
        System.out.print(mCount);
    }
}