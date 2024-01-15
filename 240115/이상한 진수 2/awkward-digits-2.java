import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String [] str = a.split("");
        int [] arr = new int[str.length];
        int digit = 0;
        int count =0;
        for(int i =0; i<str.length; i++){
            if(str[i].equals("1")){
                count++;
            }
        }
        if(count==str.length){
            str[str.length-1] ="0";
        }else {
            for(int i =0; i<str.length; i++){
                if(str[i].equals("0")){
                    str[i]="1";
                    break;
                }
            }
        }
        for(int i=str.length-1; i>=0; i--){
            if(str[i].equals("1")){
                arr[i]= (int)Math.pow(2,digit);
                digit++;
            }
            else digit++;
        }
        int sum =0;
        for(int i =0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}