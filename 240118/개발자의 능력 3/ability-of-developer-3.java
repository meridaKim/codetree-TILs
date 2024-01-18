import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }
        int [] arr = list.stream().mapToInt(i->i).toArray();
        int diff= Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    diff = Math.min(diff, makeTeam(i,j,k,arr));
                }
                
            }
        }
        System.out.print(diff);
        
    }
    public static int makeTeam(int i , int j, int k ,int [] arr){
        int sum1 = arr[i]+arr[j]+arr[k];
        int sum2 =0;
        for(int l=0; l<arr.length; l++){
            sum2+=arr[l];
        }
        sum2 = sum2-sum1;
        return Math.abs(sum1-sum2);
        
    }
}