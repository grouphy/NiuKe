package dkc_0328;

import java.math.BigInteger;
import java.util.Scanner;
/*
 	对于一个整数N（512 <= N <= 1024），计算2的N次方并在屏幕显示十进制结果。
输入描述:
输入一个整数N（512 <= N <= 1024）
 */
public class PowerOf2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger bi = new BigInteger("2");
		System.out.println(bi.pow(n));
	}
}
