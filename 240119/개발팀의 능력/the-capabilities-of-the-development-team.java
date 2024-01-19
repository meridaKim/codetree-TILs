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
            for(int j =0; j<arr.length; j++){
                for(int k=0; k<arr.length; k++){
                    for(int l =0; l<arr.length; l++){
                        if(i!=j&&i!=k&&i!=l&&j!=k&&j!=l&&k!=l){
                            if(makeTeam(i,j,k,l,arr)==-1){
                                diff = Integer.MAX_VALUE;
                            }else{diff = Math.min(diff, makeTeam(i,j,k,l,arr));}
                            
                            
                        }
                        
                    }
                   
                }
                
            }
        }
        if(diff==Integer.MAX_VALUE){
            diff = -1;
        }
        System.out.print(diff);
        
    }
    public static int makeTeam(int i , int j, int k ,int l,int [] arr){
        int sum1 = arr[i]+arr[j];
        int sum2 =arr[k]+arr[l];
        int sum3 =0;
        for(int a=0; a<arr.length; a++){
            sum3+=arr[a];
        }
        sum3 = sum3-sum1-sum2;
        
        
        
        int minT = Math.min(sum1,sum2);
        minT = Math.min(minT, sum3);
        int maxT= Math.max(sum1,sum2);
        maxT = Math.max(maxT,sum3);
        if(Math.abs(minT-maxT)==0){
            return -1;
        }if(sum3==sum1||sum3==sum2||sum2==sum1){
                return Integer.MAX_VALUE;
        }
        return Math.abs(minT-maxT);
        
        
    }
}