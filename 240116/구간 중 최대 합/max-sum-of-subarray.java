import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int [] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum;
        int sMax= Integer.MIN_VALUE;
        for(int i=0; i<=n-k;i++){
            sum = 0;
            sum+=arr[i];
            for(int j =i+1; j<i+k; j++){
                sum+=arr[j];
            }
            sMax =Math.max(sMax,sum);
        }
        System.out.print(sMax);
    }
}