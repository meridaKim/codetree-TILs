import java.util.*;
import java.io.*;
public class Main {
    static int n;
    static int m;
    public static boolean inRange(int x, int y){
        return x>=0 && x<n && y>=0 && y<m;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        char [][] chr = new char[n][m];
        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j =0; j<m; j++){
                chr[i][j]=str.charAt(j);
            }
        }
        int [] dx = {1, 1, 1, -1, -1, -1, 0, 0};
        int [] dy = {-1, 0, 1, -1, 0, 1, -1, 1};
        int Lcnt =0;
        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                if(chr[i][j]=='L'){
                    for(int k=0; k<dx.length; k++){
                        int count =1;
                        int x = i;
                        int y = j;
                        while(true){
                            int nx = x+dx[k];
                            int ny = y+dy[k];
                            if(inRange(nx, ny)==false) break;
                            if(chr[nx][ny]!='E') break;
                            count++;
                            x = nx;
                            y = ny;
                            
                        }
                        if(count>=3){
                            Lcnt++;
                        }
                        
                    }
                }
                
            }
        }
        System.out.print(Lcnt);
    }
}