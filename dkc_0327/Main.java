package dkc_0327;
import java.util.*;
/*
 	如果一个整数只能被1和自己整除,就称这个数是素数。
如果一个数正着反着都是一样,就称为这个数是回文数。例如:6, 66, 606, 6666
如果一个数字既是素数也是回文数,就称这个数是回文素数
牛牛现在给定一个区间[L, R],希望你能求出在这个区间内有多少个回文素数。
 */
public class Main{
    public static void main(String[] args){
    	System.out.println(isPrime(0));
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        int l = sc.nextInt();
        System.out.println("请输入:");
        int r = sc.nextInt();
        int[] arr = new int[r-l+1];
        for(int i = 0;i<arr.length;i++){
            arr[i] = l++;
        }
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(isPrime(arr[i]) && isPalindrome(arr[i])){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(int n){
        int len = (int)Math.sqrt(n);
        for(int i = 2;i<=len;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int i){
        char[] chars = String.valueOf(i).toCharArray();
        int l = 0;
        int r = chars.length - 1;
        while(l<=r){
            if(chars[l++] != chars[r--]) return false;
        }
        return true;
    }
}