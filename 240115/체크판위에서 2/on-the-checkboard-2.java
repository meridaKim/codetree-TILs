import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st =new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String [][] arr = new String [N][M];
        for(int i = 0; i<N; i++){
            st =new StringTokenizer(br.readLine());
            for(int j =0; j<M; j++){
                arr[i][j] = st.nextToken();
            }
        }
        int count=0;
        for(int i = 0; i<N-1; i++){
            for(int j =0; j<M-1; j++){
                    for(int k=i+1; k<N-1; k++){
                        for(int l=j+1; l<M-1; l++){
                                    if(!arr[i][j].equals(arr[k][l])&&!arr[k][l].equals(arr[N-1][M-1])){
                                        count++;
                                    }
                        }
                        
                    }
                }
            }
            System.out.print(count);
        }
        
    }