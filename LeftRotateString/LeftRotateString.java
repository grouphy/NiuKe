package Offer.dkc_0417;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-17
 * Time:20:24
 */
/*
汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，
请你把其循环左移K位后的序列输出。
例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
public class LeftRotateString {
    public static void main(String[] args) {
        System.out.println(leftRotateString("abcdef",2));
    }
    public static String leftRotateString(String str,int n) {
        int len = str.length();
        if(len == 0){
            return "";
        }
        int rom = (len - n) % len;
        str = reverse(str,0,len-1);
        str = reverse(str,0,rom-1);
        str = reverse(str,rom,len-1);
        return str;
    }

    public static String reverse(String str,int s,int e){
        char[] chars = str.toCharArray();
        while(s<=e){
            char c = chars[s];
            chars[s++] = chars[e];
            chars[e--] = c;
        }
        return new String(chars);
    }
}
