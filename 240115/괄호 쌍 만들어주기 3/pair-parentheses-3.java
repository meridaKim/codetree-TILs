import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String [] arr = str.split("");
        int count =0; 
        for(int i =0; i<arr.length; i++){
            if(arr[i].equals("(")){
                for(int j =i; j<arr.length; j++){
                    if(arr[j].equals(")")){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
        
    }
}