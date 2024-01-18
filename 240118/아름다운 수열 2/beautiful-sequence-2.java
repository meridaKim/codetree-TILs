import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        ArrayList<Integer>list = new ArrayList<>();
        for(int i =0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        int count;
        int eCnt=0;
        for(int i=0; i<n; i++){
            for(int j =i; j<n; j++){
                ArrayList<Integer> tmp = new ArrayList<>();
                count=0;
                for(int k = i; k<=j; k++){
                    if(j-i+1==m){
                        tmp.add(arr[k]);
                    }
                    
                }
                if(tmp.size()>0){
                Collections.sort(tmp);
                Collections.sort(list);
                boolean isExist = true;
                for(int l =0; l<m; l++){
                    if(tmp.get(l)!=list.get(l)) {
                        isExist=false;
                        break;
                        }
                }
                if(isExist) eCnt++; 
                }
            }
        } System.out.print(eCnt);
    }   
}