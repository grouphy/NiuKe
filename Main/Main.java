package PAT;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-10
 * Time:17:50
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int a = 0; int b = 0; int c = 0; int d = 0; int e = 0; int count = 0; int s = 1;
        for(int i = 0;i<n;i++){
            //A1 = 能被5整除的数字中所有偶数的和；
            if(arr[i]%5 == 0 && arr[i]%2 == 0){
                a += arr[i];
            }
            //A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
            if(arr[i]%5 == 1){
                b += arr[i]*s;
                s = -s;
            }
            //A3 = 被5除后余2的数字的个数；
            if(arr[i]%5 == 2){
                c++;
            }
            //A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
            if(arr[i]%5 == 3){
                d += arr[i];
                count++;
            }
            //A5 = 被5除后余4的数字中最大数字
            if(arr[i]%5 == 4){
                e = Math.max(e,arr[i]);
            }
        }
        if(a == 0){
            System.out.print("N"+" ");
        }else{
            System.out.print(a+" ");
        }
        if(b == 0){
            System.out.print("N"+" ");
        }else{
            System.out.print(b+" ");
        }
        if(c == 0){
            System.out.print("N"+" ");
        }else{
            System.out.print(c+" ");
        }
        if(d == 0){
            System.out.print("N"+" ");
        }else{
            System.out.print(String.format("%.1f",(double)d/count)+" ");
        }
        if(e == 0){
            System.out.print("N");
        }else{
            System.out.print(e);
        }

    }
}
