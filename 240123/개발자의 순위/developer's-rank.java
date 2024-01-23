import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); //경기갯수
        int n = sc.nextInt(); //개발자명수
        int [][] rank = new int [k][n];
        for(int i =0; i<k; i++){
            for(int j=0; j<n; j++){
             rank[i][j] = sc.nextInt();   
            }
        }
        int [][] graph = new int [n+1][n+1];
        for(int i=0; i<k; i++){
            for(int j =0; j<n; j++){
                int p=rank[i][j];
                for(int l=j+1; l<n; l++){
                    graph[p][rank[i][l]]++;
                }
            }
        }
        int count=0;
        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                if(graph[i][j]==k){
                    count++;
                }
            }
        }
        System.out.print(count);

    }
}