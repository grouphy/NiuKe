package offer2018.stringminprice0430;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-30
 * Time:17:18
 * 有一种有趣的字符串价值计算方式:统计字符串中每种字符出现的次数,然后求所有字符次数的平方和作为字符串的价值
 * 例如: 字符串"abacaba",里面包括4个'a',2个'b',1个'c',于是这个字符串的价值为4 * 4 + 2 * 2 + 1 * 1 = 21
 * 牛牛有一个字符串s,并且允许你从s中移除最多k个字符,你的目标是让得到的字符串的价值最小。
 * 输入描述：
 * 输入包括两行,第一行一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),其中只包含小写字母('a'-'z')。
 * 第二行包含一个整数k(0 ≤ k ≤ length),即允许移除的字符个数。
 * 输出描述:
 * 输出一个整数,表示得到的最小价值
 */
public class StringMinPrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        int[] arr = new int[26];
        //统计每个字符数
        for(int i = 0;i<s.length();i++){
            arr[s.charAt(i) - 97]++;
        }
        //排序
        Arrays.sort(arr);
        while(k>0){
            //在k大于0的情况下，从后向前遍历，将最大的数减1，让它和次它的相等，然后继续重复上述操作
            for(int i = arr.length-1;i>0&&k>0;i--){
                if(arr[i]!=arr[i-1]){
                    arr[i] -= 1;
                    k--;
                    break;
                }else{
                    arr[i] -= 1;
                    k--;
                }
            }
        }
        //统计总和
        int sum = 0;
        for(int i : arr){
            if(i!=0) {
                sum += i * i;
            }
        }
        System.out.println(sum);
    }
}
