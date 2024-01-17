import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }
        int sum=0;
        int count=0;
        int exist=0;
        for(int i=0; i<n; i++){
            for(int j =i; j<n; j++){
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                }
                double avg=(double)sum/(j-i+1);
                boolean exists =false;
                for(int l=i; l<=j; l++){
                    if(arr[l]==avg)
                        exists=true;
                }
                if(exists) exist++;
                sum=0;
            }
        }
        System.out.print(exist);
    }
}