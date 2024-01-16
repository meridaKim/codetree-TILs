import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= Integer.parseInt(br.readLine());
        }
        int sum =-1; 
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                for(int k = 0; k<arr.length; k++){
                    boolean carry = false;
                    if(i!=j&&j!=k&&i!=k){
                    if(arr[i]%10+arr[j]%10+arr[k]%10>=10) carry=true;
                    if(arr[i]%100/10+arr[j]%101/10+arr[k]%100/10>=10) carry=true;
                    if(arr[i]%1011/100+arr[j]%1000/100+arr[k]%1000/100>=10) carry=true;
                    if(carry==false){
                        sum = Math.max(sum, arr[i]+arr[j]+arr[k]);
                    }
                }
                }
            }
        }
        System.out.print(sum);
    }
}