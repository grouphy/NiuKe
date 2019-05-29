package closePar;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-05-29
 * Time:23:49
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[32];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2;i<32;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        int n = sc.nextInt();
        int max = 0;
        for(int i = 0;i<31;i++){
            if(n == arr[i]){
                System.out.println(0);
                return;
            }
            if(n>arr[i]&&n<arr[i+1]){
                max = Math.min(n-arr[i],arr[i+1]-n);
                System.out.println(max);
                return;
            }
        }
        //System.out.println(add(31));
    }
}
