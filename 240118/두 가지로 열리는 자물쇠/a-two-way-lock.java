import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st ;
        int [][] arr = new int[2][3];
        for(int i=0; i<2; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            
        }
        int count=0;
        for(int i =0; i<arr.length; i++){
            for(int j =1; j<=n; j++){
                for(int k=1; k<=n; k++){
                    for(int l =1; l <=n; l++){
                        if(Math.min(Math.abs(arr[i][0]-j),Math.abs(n-(j-arr[i][0])))<=2&&Math.min(Math.abs(arr[i][1]-k),Math.abs(n-(k-arr[i][1])))<=2&&Math.min(Math.abs(arr[i][2]-l),Math.abs(n-(l-arr[i][2])))<=2){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.print(count-1);
    }
}