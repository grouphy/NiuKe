package PAT.dkc04_11;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-11
 * Time:9:31
 */
public class Kaprekar {
    public static void main(String[] args) {
        BigInteger bi1 = null;
        BigInteger bi2 = null;
        BigInteger bi3 = null;
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        while(true){
            bi1 = new BigInteger(String.valueOf(desc(n)));
            bi2 = new BigInteger(reverse(desc(n)));
            bi3 = bi1.subtract(bi2);
            if(bi3.equals(new BigInteger("0"))){
                System.out.println(bi1+" - "+reverse(desc(n))+" = 0000");
                System.exit(0);
            }else if(n.equals("6174")){
                System.out.println(bi1 + " - " + reverse(desc(n)) + " = " + bi3);
                break;
            }else if(bi3.equals(new BigInteger("6174"))){
                System.out.println(bi1 + " - " + reverse(desc(n)) + " = " + bi3);
                break;
            }
            else {
                System.out.println(bi1 + " - " + reverse(desc(n)) + " = " + bi3);
                n = bi3.toString();
            }

        }

    }
    //逆序
    public static String reverse(int n){
        char[] chars = String.valueOf(n).toCharArray();
        int b = 0;
        int e = chars.length-1;
        while(b<=e){
            char tmp = chars[b];
            chars[b++] = chars[e];
            chars[e--] = tmp;
        }
        return new String(chars);
    }
    //降序输出排序
    public static int desc(String s){
        int len = s.length();
        if(len<4){
            while(4>len){
                s += "0";
                len++;
            }
        }
        char[] chars = s.toCharArray();
        int[] arr = new int[chars.length];
        for(int i = 0;i<chars.length;i++){
            arr[i] = chars[i] - '0';
        }
        Arrays.sort(arr);
        int ret = 0;
        for(int i = 0;i<chars.length;i++){
            ret += arr[i]*(int) pow(10,i);
        }
        return ret;
    }
}
