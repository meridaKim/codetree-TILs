import java.util.*;
public class Main {
    static int []x;
    static int []y;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //x축 평행은 y좌표가 같은 두 점
        //y축 평행은 x좌표가 같은 두 점
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        x = new int[n];
        y = new int[n];
        for(int i=0; i<n; i++){
            x[i] =sc.nextInt();
            y[i] =sc.nextInt();
                    }
        int result = 0;
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                for(int k=0; k<n; k++){
                    if(i==j||i==k||j==k) continue;
                    result = Math.max(calculate(i,j,k),result);
                }
            }
        }
        System.out.print(result);
    }
    public static int calculate(int i, int j, int k){
        if((x[i] == x[j] || x[i] == x[k] || x[j] == x[k]) &&
                       (y[i] == y[j] || y[i] == y[k] || y[j] == y[k])){
            return Math.abs(x[i]-x[j])*Math.abs(y[j]-y[k]);
        }else return 0;
    }
}