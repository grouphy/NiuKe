package Dynamicprogramming.bitcount;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 *
 * 示例 1:
 *
 * 输入: 2
 * 输出: [0,1,1]
 * 示例 2:
 *
 * 输入: 5
 * 输出: [0,1,1,2,1,2]
 * User:Mr.Du
 * Date:2019-05-20
 * Time:7:48
 */
public class CountBits {
    public int[] countBits(int num){
        int[] dp = new int[num+1];
        for (int i = 1; i <=num ; i++) {
            dp[i]=dp[(i-1)&i]+1;
        }
        return dp;
    }

    public static void main(String[] args) {
        System.out.println(2&3);
        for(int i = 1;i<=100;i++){
            System.out.println(i+"&"+(i-1)+"="+(i&(i-1)));
        }
    }
}
