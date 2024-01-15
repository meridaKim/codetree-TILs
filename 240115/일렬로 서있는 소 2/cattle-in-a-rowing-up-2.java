import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int [n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count=0;
        for(int i = 0; i<n; i++){
            int first =arr[i];
            for(int j =i+1; j<n; j++){
                if(arr[j]>=first){
                    int second = arr[j];
                    for(int k=j+1; k<n; k++){
                        if(arr[k]>=second){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.print(count);
    }
}