package dkc_0328;

import java.util.Scanner;
/*
 	定整数n，取若干个1到n的整数可求和等于整数m，编程求出所有组合的个数。比如当n=6，m=8时，
 	有四种组合：[2,6], [3,5], [1,2,5], [1,3,4]。限定n和m小于120
	输入描述:
		整数n和m
	该题利用动态规划的思想去做，
 */
public class Dp {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getSum(n,m));
    }
    
    public static int getSum(int n, int m){
        if(n<1||m<1) return 0;
        if(m<n) n = m;
        int sum = 0;
        if(m == n) sum++;
        //选择第n个数
        sum += getSum(n-1,m-n);
        //不选择第n个数
        sum += getSum(n-1,m);
        return sum;
    }
}
