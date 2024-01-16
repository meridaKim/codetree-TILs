import java.io.*;
import java.util.*;
public class Main {
    static StringTokenizer st ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int [] arr = new int [n];
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum =0;
        int abjMin = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                    if(i!=j&&j!=i+1){
                    sum+=arr[j];
                        }
            }
            abjMin = Math.min(abjMin, Math.abs(s-sum));
            sum=0;
        }
        System.out.print(abjMin);
    }   
}