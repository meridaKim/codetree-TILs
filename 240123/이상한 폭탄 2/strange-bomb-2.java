import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        int num = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            num = Math.max(arr[i],num);
        }
        int [] count;
        int max;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int start = Math.max(i-k,0);
            int end = Math.min(i+k, n-1);
            count = new int[num+1];
            for(int j = start; j<=end; j++){
                count[arr[j]]++;
            }
            max = Integer.MIN_VALUE;
            for(int l=0; l<count.length; l++){
                if(count[l]>1){
                    max = Math.max(max, l);
                }
            }
            list.add(max);
        }
        if(list.size()==0){
            System.out.print(-1);
        }else{
            Collections.sort(list);
            Collections.reverse(list);
            System.out.print(list.get(0));
        }
        
    }
}