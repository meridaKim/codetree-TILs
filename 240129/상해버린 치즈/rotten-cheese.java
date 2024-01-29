import java.util.*;
import java.io.*;
public class Main {
    static int N;
    static int M;
    static int D;
    static int S;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        int [][] arr = new int[D][3];
    
        for(int i=0; i<D; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }

        int [][] srr = new int[S][2];
        
        for(int i=0; i<S; i++){
            st = new StringTokenizer(br.readLine());
            srr[i][0] = Integer.parseInt(st.nextToken());
            srr[i][1] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Set<Integer>> list =new ArrayList<>();
        for(int i =1; i<M+1; i++){list.add(new HashSet<Integer>());}
        for(int k =0; k<S; k++){
            int cheeze = 0;
            int time =0;
             for(int i=0; i<D; i++){
                    if(srr[k][0]==arr[i][0]&&srr[k][1]>arr[i][2]){
                        //치즈 찾기
                        cheeze = arr[i][1];
                        time = srr[k][1];
                        for(int j =0; j<D; j++){
                            if(cheeze==arr[j][1]){
                                if(time>=arr[j][2]||time<arr[j][2])
                                list.get(cheeze-1).add(arr[j][0]);
                            }
                        }
                        
                    }
            }
            
        }
       int max = Integer.MIN_VALUE;
            for(int i =1; i<M+1; i++){
                max = Math.max(list.get(i-1).size(), max);
                //  System.out.println(list.get(i-1).size());
               
            }
            System.out.println(max);
    }
}