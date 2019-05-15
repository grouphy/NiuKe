package playingCard;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-05-15
 * Time:19:29
 */
public class Main {
    public static void main(String[] args){
        int[] arr = new int[14];
        for(int i = 1;i<arr.length;i++){
            arr[i] = 4;
        }
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int sum1 = 0;
        int sum2 = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<3;i++){
            arr1[i] = sc.nextInt();
            arr[arr1[i]]--;
            sum1 += arr1[i];
        }
        for(int i = 0;i<3;i++){
            arr2[i] = sc.nextInt();
            if(arr[arr2[i]] == 0){
                int tmp = arr2[i];
                while(tmp == arr2[i])
                    arr2[i] = sc.nextInt();
            }
            arr[arr2[i]]--;
            sum2 += arr2[i];
        }
        System.out.println(Arrays.toString(arr));
        int t = Math.abs(sum1-sum2);
        double d1 = 0.0;
        if(sum1<=sum2){
            for(int i = 2+t;i<arr.length;i++){
                for(int j = i-t-1;j>0;j--){
                    if(arr[i]!=0&&arr[j]!=0){
                        d1+=(arr[i]*1.0/46)*(arr[j]*1.0/45);
                    }
                }
            }
        }else{
            for(int i = 1;i<arr.length-t;i++){
                for(int j = 1;j<i+t;j++){
                    if(arr[i]!=0&&arr[j]!=0){
                        d1+=(arr[i]*1.0/46)*(arr[j]*1.0/45);
                    }
                }
            }
        }
        System.out.printf("%.4f",d1);
    }
}
