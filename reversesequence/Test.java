package reversesequence;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:小Q定义了一种数列称为翻转数列:
 * 给定整数n和m, 满足n能被2m整除。对于一串连续递增整数数列1, 2, 3, 4..., 每隔m个符号翻转一次, 最初符号为'-';。
 * 例如n = 8, m = 2, 数列就是: -1, -2, +3, +4, -5, -6, +7, +8.
 * 而n = 4, m = 1, 数列就是: -1, +2, -3, + 4.
 * 小Q现在希望你能帮他算算前n项和为多少。
 * User:Mr.Du
 * Date:2019-05-20
 * Time:19:21
 */
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        long sum = 0;
        for(int i = 1;i<=m;i++){
            if(count<n){
                count++;
                sum += -i;
            }else if(count>=n&&count<2*n){
                sum += i;
                count++;
            }else{
                i--;
                count = 0;
            }
        }
        System.out.println(sum);
    }
}
