import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[3];
        for(int i=0; i<3; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int c1=0;
        int c2=0;
        int c3=0;
            for(int j =1; j<n+1; j++){
                if(Math.abs(arr[0]-j)>2){
                    c1++;
                }if(Math.abs(arr[1]-j)>2){
                    c2++;
                }if(Math.abs(arr[2]-j)>2){
                    c3++;
                }

            }
       
        System.out.print((int)Math.pow(n,arr.length)-(c1*c2*c3));
    }
}