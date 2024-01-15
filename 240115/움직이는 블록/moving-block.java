import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        int sum =0;
        for(int i =0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        int avg = sum/n;
        int answer =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>avg){
                answer+=arr[i]-avg;
            }
        }
        System.out.print(answer);
    }
}