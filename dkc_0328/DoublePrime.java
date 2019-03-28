package dkc_0328;

import java.util.Scanner;
/*
 	一个正整数是素数当且仅当它除了1和自身以外没有其他因子，现在我们定义双素数；一个正整数是双素数当且仅当它本身是个素数，
 	并且将他的十进制表示反转后得到数不等于它自身且也是个素数，
 	如13就是一个双素数，因为13和31不相等且都是素数，现给出一个整数k,你需要找到第k小的双素数
 		解题思路：
 			1.判断是否是素数
 			2.逆转是否和逆转前相等
 			3.逆转后是否素数
 */
public class DoublePrime {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 3;i< 1000000;i++){
            if(isPrime(i) && reverse(i)!= i && isPrime(reverse(i))){
                count++;
            }
            if(count == n){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
        
    }
	//逆转
    public static int reverse(int n){
        int ret = 0;
        while(n!=0){
            ret = ret*10+n%10;
            n /= 10;
        }
        return ret;
    }
    //是否是素数
    public static boolean isPrime(int n){
        if(n == 1) return false;
        int k = (int)Math.sqrt(n);
        for(int i = 2;i<=k;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
