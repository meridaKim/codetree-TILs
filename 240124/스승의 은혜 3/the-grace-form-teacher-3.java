import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<int []> list = new ArrayList<int []>();
        for(int i=0; i<n; i++){
            int price = sc.nextInt();
            int delivery = sc.nextInt();
            int [] graph = {price, delivery};
            list.add(graph);
        }
        Collections.sort(list, (o1,o2)->{
            if(o1[0] == o2[0]){
                return o1[1] -o2[1];
            }
            return o1[0] -o2[0];
        });
        // for(int i=0; i<list.size(); i++){
        //     int [] arr = new int[2];
        //     for(int j =0; j<list.get(i).length; j++){
        //         arr =list.get(i);
        //         System.out.println(arr[j]);
        //     }
        // }
        int sum =0;
        int count=0;
        int max = Integer.MIN_VALUE;
        boolean coupon = false;
        int [] arr = new int[2];
        for(int i=0; i<n; i++){
            sum=0;
            arr = list.get(i);
            for(int k =0; k<2; k++){
                sum+=arr[k];
            }
            count++;
            coupon=false;
            for(int j =0; j<n; j++){
                if(i==j) continue;
                if(sum<=m) {
                    arr = list.get(j);
                    for(int l =0; l<2; l++){
                        sum+=arr[l];
                    }
                    count++;
                    }
                if(sum>m){
                    for(int p =0; p<2; p++){
                        sum-=arr[p];
                    }
                    count--;
                    sum+=arr[0]/2;
                    sum+=arr[1];
                    if(sum>m) {
                        sum-=arr[0]/2;
                        sum-=arr[1];
                        break;
                    }
                    if(sum<=m&&coupon==false){
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