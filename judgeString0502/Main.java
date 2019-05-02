package offer2018.judgeString0502;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-05-02
 * Time:23:16
 * 题目描述
 * 对于任意两个正整数x和k,我们定义repeat(x, k)为将x重复写k次形成的数,例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
 * 牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),请你来比较v1和v2的大小。
 * 输入描述:
 * 输入包括一行,一行中有4个正整数x1, k1, x2, k2(1 ≤ x1,x2 ≤ 10^9, 1 ≤ k1,k2 ≤ 50),以空格分割
 * 输出描述:
 * 如果v1小于v2输出"Less",v1等于v2输出"Equal",v1大于v2输出"Greater".
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int k1 = sc.nextInt();
        int x2 = sc.nextInt();
        int k2 = sc.nextInt();
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for(int i = 0;i<k1;i++){
            sb1.append(x1);
        }
        for(int i = 0;i<k2;i++){
            sb2.append(x2);
        }
        if(sb1.length()>sb2.length()){
            System.out.println("Greater");
        }else if(sb1.length()<sb2.length()){
            System.out.println("Less");
        }else{
            if(sb1.toString().compareTo(sb2.toString())>0){
                System.out.println("Greater");
            }else if(sb1.toString().compareTo(sb2.toString()) == 0){
                System.out.println("Equal");
            }else{
                System.out.println("Less");
            }
        }

    }
}
