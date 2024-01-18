import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int [] arr = new int[101];
        int end =0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int location = Integer.parseInt(st.nextToken());
            end = Math.max(location, end);
            char p = st.nextToken().charAt(0);
            if(p=='G') arr[location] = 1;
            if(p=='H') arr[location] = 2;
        }
        int max =0;
        for(int i=0; i<arr.length; i++){
    
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]==0|| arr[j]==0) continue;
                int G =0;
                int H =0;
                for(int k=i; k<=j; k++){
                    if(arr[k]==1){
                        G++;
                    }if(arr[k]==2){
                        H++;
                    }
                }
                if(G==0||H==0||G==H) {
                    max = Math.max(j-i,max);
                    }
            }
        }
        System.out.println(max);

    }
}