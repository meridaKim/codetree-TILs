import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [] arr = new int [n];
        st = new StringTokenizer(br.readLine());
        int zero =0;
        for(int i =0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int wifi =0;
        for(int i =0; i<n; i++){
            if(arr[i]==1){
                wifi++;
                i+= 2*m;
            }
        }
        
        System.out.print(wifi);

    }
}