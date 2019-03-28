package dkc_0328;

import java.util.Scanner;
/*
 	数字逆转
 */
public class ReverseNum {
	public static void main(String[] args) {
		System.out.println("请输入:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ret = 0;
		while(n!=0) {
			ret = ret*10 + n%10;
			System.out.println("ret = "+ret);
			n /= 10;
		}
		System.out.println(ret);
	}
}
