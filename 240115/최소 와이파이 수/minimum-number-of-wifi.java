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
        for(int i =0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int wifi = n/(m*2+1)+n%(m*2+1);
        System.out.print(wifi);

    }
}