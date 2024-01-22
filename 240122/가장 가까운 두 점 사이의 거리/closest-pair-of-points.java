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
        int xMin =Integer.MAX_VALUE;
        int yMin =Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j =i+1; j<n; j++){
                xMin = Math.min(Math.abs(x[i]-x[j]),xMin);
                yMin = Math.min(Math.abs(y[i]-y[j]),yMin);
            }
        }
        System.out.println(xMin*xMin+yMin*yMin);
    }
}