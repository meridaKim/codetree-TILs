import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] x1 = new int[n];
        int [] x2 = new int[n];
        for(int i=0; i<n; i++){
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        
        int result=0;
        for(int i=0; i<n; i++){
            boolean overlap = false;
            for(int j =0; j<n; j++){
                if(i==j) continue;
                
                    if((x1[i]<=x1[j]&&x1[j]<=x2[i])||(x1[i]<=x2[j]&&x2[j]<=x2[i])){
                        overlap=true;
                        break;
                    }
                
                
            }
            if(overlap==false) {
                result++;
                }
        }
        System.out.print(result);
    }
}