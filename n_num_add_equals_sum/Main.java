package n_num_add_equals_sum;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:n个数等于sum的方法数：给定一串数字，求这一串数字中和等于sum的方法数
 * User:Mr.Du
 * Date:2019-05-24
 * Time:23:46
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        //该数组第一个元素为0，其余元素为要输入的元素
        arr[0] = 0;
        for(int i = 1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(nNumAddSumCount(arr,40));
    }

    public static int nNumAddSumCount(int[] arr,int sum){
        int n = arr.length;
        //定义二维数组，用来表示方法数
        int[][] dp = new int[n][sum+1];
        //对第一列全部赋1
        for(int i = 0;i<n;i++){
            dp[i][0] = 1;
        }
        //对第一行除第一个位置外其余赋0
        for(int i = 1;i<=sum;i++){
            dp[0][i] = 0;
        }
        for(int i = 1;i<n;i++){
            for(int j = 1;j<=sum;j++){
                //如果arr[i]>j，此时(i,j)位置的值为(i-1,j)位置的值
                if(arr[i]>j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j]+dp[i-1][j-arr[i]];
                }
            }
        }
        return dp[n-1][sum];
    }
}
