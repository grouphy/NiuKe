package offer2018.pingcouSquare0430;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-30
 * Time:17:52
 * 牛牛有4根木棍,长度分别为a,b,c,d。羊羊家提供改变木棍长度的服务,如果牛牛支付一个硬币就可以让一根木棍的长度加一或者减一。
 * 牛牛需要用这四根木棍拼凑一个正方形出来,牛牛最少需要支付多少硬币才能让这四根木棍拼凑出正方形。
 * 输入描述:
 * 输入包括一行,四个整数a,b,c,d(1 ≤ a,b,c,d ≤ 10^6), 以空格分割
 * 输出描述:
 * 输出一个整数,表示牛牛最少需要支付的硬币
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0;i<4;i++){
            arr[i] = sc.nextInt();
        }
        //对输入数字进行排序
        Arrays.sort(arr);
        //算出中间两个值得平均值，他就是正方形边长
        int mid = (arr[1]+arr[2])/2;
        //统计裁剪次数
        int sum = 0;
        for(int i:arr){
            if(i<mid)
                sum += mid -i;
            else
                sum += i - mid;
        }
        System.out.println(sum);
    }
}
