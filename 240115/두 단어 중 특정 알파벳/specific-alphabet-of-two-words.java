import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0; i<26; i++){
            char a = (char)(97+i);
            map.put(a,0);
        }
        StringTokenizer st;
        for(int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
        }
        
    }
}