import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        
        int [] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }
        int sum;
        int count;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j =i+t; j<n; j++){
                sum=0;
                count=0;
               for(int k =i; k<=j; k++){
                    if(count>=t){
                        break;
                    }
                    if(arr[k]==h){
                        count++;
                    }else{
                        count++;
                        sum+=Math.abs(h-arr[k]);
                    }
               }
               
               min = Math.min(min,sum);
            }
        }
        System.out.print(min);
    }
}