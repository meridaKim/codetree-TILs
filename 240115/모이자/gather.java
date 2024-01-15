import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }
        int sumMin = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            int dist =0;
            int sum =0;
            for(int j =0; j<arr.length; j++){
                if(i!=j){
                   dist=Math.abs(i-j);
                   sum+=dist*arr[j];
                }else continue;
                
            }
            sumMin = Math.min(sum, sumMin);
        }
        System.out.print(sumMin);
    }
}