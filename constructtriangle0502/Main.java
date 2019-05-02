package offer2018.constructtriangle0502;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-05-02
 * Time:22:57
 * 题目描述
 * 牛牛手中有三根木棍,长度分别是a,b,c。牛牛可以把任一一根木棍长度削短,牛牛的目标是让这三根木棍构成一个三角形,
 * 并且牛牛还希望这个三角形的周长越大越好。
 * 输入描述:
 * 输入包括一行,一行中有正整数a, b, c(1 ≤ a, b, c ≤ 100), 以空格分割
 * 输出描述:
 * 输出一个整数,表示能拼凑出的周长最大的三角形。
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean bool = true;
        int max = 0;
        while(bool){
            if(a+b>c&&b+c>a&&c+a>b){
                max = a + b + c;
                bool = false;
            }else{
                if(a+b<=c){
                    c = a + b - 1;
                }else if(a+c<=b){
                    b = a + c - 1;
                }else if(b+c<a){
                    a = b + c - 1;
                }
            }
        }
        System.out.println(max);
    }
}
