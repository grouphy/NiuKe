package offer2018.sort0430;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-30
 * Time:15:42
 * 题目描述
 * 牛牛有一个长度为n的整数序列,牛牛想对这个序列进行重排为一个非严格升序序列。牛牛比较懒惰,他想移动尽量少的数就完成重排,
 * 请你帮他计算一下他最少需要移动多少个序列中的元素。(当一个元素不在它原来所在的位置,这个元素就是被移动了的)
 */
public class Sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] tmp = arr.clone();
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]!=tmp[i])
                count++;
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }
}
