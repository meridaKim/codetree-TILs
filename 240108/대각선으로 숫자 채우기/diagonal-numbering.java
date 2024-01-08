import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int count = 1;

        // 2차원 배열을 구현합니다.
        int[][] arr = new int[n][m];

        // 열부터 한칸씩 이동
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) 
                // 대각선으로 채우다가 모든 열을 다 채우면 0인 곳부터 다시 대각선 채우기
                if(arr[row][col] == 0) {
                    int currCol = col;
                    int currRow = row;

                    while(currCol >= 0 && currRow < n) {
                        arr[currRow][currCol] = count;

                        // 변수 업데이트 :
                        currRow++;
                        currCol--;
                        count++;
                    }
                }
        }
                
        // 출력:
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}