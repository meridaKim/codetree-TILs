import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str.contains("ee")){
            System.out.print("YES ");
        }else System.out.print("NO ");
        
        if(str.contains("ea")){ 
            System.out.print("YES ");
        }else System.out.print("NO ");
        

    }
}