import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int [] []arr = new int [n][2];
        for(int i =0; i<n; i++){
          st  = new StringTokenizer(br.readLine());
          arr[i][0] = Integer.parseInt(st.nextToken());
          arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int sx = arr[0][0];
        int sy = arr[0][1];
        int ex = arr[arr.length-1][0];
        int ey = arr[arr.length-1][1];
        int pathMin = Integer.MAX_VALUE;
        for(int i =1; i<n-1; i++){
                pathMin = Math.min(pathMin,Math.abs(arr[i][0]-sx) + Math.abs(arr[i][1]-sy)+Math.abs(arr[i][0]-ex)+Math.abs(arr[i][1]-ey));
            
        }
        System.out.print(pathMin);
    }
}