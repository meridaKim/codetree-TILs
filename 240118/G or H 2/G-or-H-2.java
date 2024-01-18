import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        char [] arr = new char[101];
        int end =0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int location = Integer.parseInt(st.nextToken());
            end = Math.max(location, end);
            arr[location] = st.nextToken().charAt(0);
        }
        int max =0;
        int count;
        for(int i=0; i<end+1; i++){
            count=0;
            for(int j = i+1; j<end+1; j++){
                if(arr[j]=='G'){
                    count++;
                }if(arr[j]=='H'){
                    count--;
                }if(count==0) {
                    max = Math.max(j-i,max);
                    break;}
            }
            if(count!=0) max = 0;
        }
        System.out.print(max);

    }
}