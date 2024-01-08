import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int [n][n];
        int count =1;
        int j =0;
        for(int i =n-1; i>=0; i--){
            if(i%2==1){
                j=n-1;
                while(j>=0){
                    arr[j][i] =count;
                    j--;
                    count++;
                }
            }else{
                j=0;
                while(j<n){
                    arr[j][i] = count;
                    j++;
                    count++;
                }
            }  
        }
        for(int i =0; i<n; i++){
            for(int k =0; k<n; k++){
                System.out.print(arr[i][k]+" ");
            }
            System.out.println();
        }
        }
        
    }