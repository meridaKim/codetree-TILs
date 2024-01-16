import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char [] arr = str.toCharArray();
        int count=0;
        for(int i =0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i]=='C'&&arr[j]=='O'&&arr[k]=='W'){
                        count++;
                }
                }
                
            }
        }
        System.out.print(count);

    }
}