import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        TreeMap<Character, Integer> map = new TreeMap<>();
        for(int i =0; i<n; i++){
            char a = st.nextToken().charAt(0);
            if(Character.isUpperCase(a)){
                continue;
            }
            map.put(a,1);
        }
        for(char key : map.keySet()){
            System.out.println(key +" : "+map.get(key));
        }
    }
}