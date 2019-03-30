package dkc_0330;

import java.util.Scanner;
/*
 	题目描述
		实现一个多项式的类（a+b*x+c*x^2+d*x^3+...+），要求输入该多项式的系数和x的值后打印出这个多项式的值。
	输入描述:
		输入第一行为样例数m，对于每个样例，第一行为多项式最高项次数n，接下来n+1个整数表示每项系数，最后一个整数x，n不超过10。
	输出描述:
		输出m行，表示个多项式代入x后的值。
	输入
		1
		2
		1 2 3
		2
	输出
		17
 */
public class PolynomialValue {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int j = 0;j<m;j++){
            int ret = 0;
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            for(int i = 0;i<n+1;i++){
                arr[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            for(int i = 0;i<n+1;i++){
                ret += arr[i]*(int)Math.pow(x,i);
            }
            System.out.println(ret);
        }
    }
	
}
