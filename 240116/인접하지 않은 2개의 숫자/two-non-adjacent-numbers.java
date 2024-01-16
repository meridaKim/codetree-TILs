import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int [n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int abjMax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(Math.abs(j-i)>1){
                    abjMax = Math.max(abjMax, arr[i]+arr[j]);
                }
            }
        }
        System.out.print(abjMax);
    }   
}