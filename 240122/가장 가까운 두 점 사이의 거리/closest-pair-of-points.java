import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] x = new int[n];
        int [] y = new int[n];
        for(int i =0; i<n; i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        int distX =0;
        int distY =0;
        int minDist=Integer.MAX_VALUE;
        int minResult=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                if(i==j) continue;
                distX = Math.abs(x[i]-x[j]);
                distY = Math.abs(y[i]-y[j]);
                minDist = Math.min(minDist, distX*distX+distY*distY);
            }
                minResult = Math.min(minDist,minResult);
        }
        System.out.println(minResult);
    }
}