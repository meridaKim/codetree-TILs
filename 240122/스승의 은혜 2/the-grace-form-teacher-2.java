import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int sum =0;
        int count=0;
        int max = Integer.MIN_VALUE;
        boolean coupon = false;
        for(int i=0; i<n; i++){
            sum=0;
            sum+=list.get(i);
            coupon=false;
            for(int j =0; j<n; j++){
                if(i==j) continue;
                if(sum<m) {
                    sum+=list.get(j);
                    count++;
                    }
                if(sum>m&&coupon==false){
                    sum-=list.get(j);
                    count--;
                    sum+=list.get(j)/2;
                    if(sum>m) {
                        sum-=list.get(j)/2;
                        break;
                    }
                    else{
                    coupon=true;
                    count++;
                    }
                } 
            }
            max = Math.max(count, max);
            count=0;
        }
        System.out.print(max);
    }
}