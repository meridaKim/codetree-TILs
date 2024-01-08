import java.util.*;
import java.io.*;
public class Main {
    static int N;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i =0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            map.put(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        br.close();
        
        
    }
    public static void dfs(TreeMap<Integer, Integer> map, int k) {
        
    } 
}