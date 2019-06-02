package bit_06_02;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:大数相加
 * User:Mr.Du
 * Date:2019-06-02
 * Time:19:58
 */
public class Main {

    public static void main(String[] args) {
       System.out.println(AddLongInteger2("99999999999999999999999999999999999999999999999999","1"));
    }
    public static String AddLongInteger2(String s1,String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        for(int i = len1-1;i>=0;i--){
            arr1[len1-i-1] = s1.charAt(i)-'0';
        }
        for(int i = len2-1;i>=0;i--){
            arr2[len2-i-1] = s2.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int[] arr = new int[len1>len2?len1:len2];
        int i1 = 0;
        int i2 = 0;
        int c = 0;
        int index = 0;
        while(i1<len1&&i2<len2){
            int tmp = arr1[i1] + arr2[i2] + c ;
            if(tmp>9){
                c = 1;
            }else{
                c = 0;
            }
            arr[index++] = tmp%10;
            i1++;
            i2++;
        }
        System.out.println("c = "+c);
        while(i1<len1){
            int tmp = arr1[i1] + c;
            if(tmp>9){
                c = 1;
            }else{
                c = 0;
            }
            arr[index++] = tmp%10;
            i1++;
        }
        while(i2<len2){
            int tmp = arr2[i2] + c;
            if(tmp>9){
                c = 1;
            }else{
                c = 0;
            }
            arr[index++] = tmp%10;
            i2++;
        }
        System.out.println(Arrays.toString(arr));
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<arr.length;i++)
            sb.append(arr[i]);
        if(c == 1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }

    public  static String AddLongInteger1(String s1,String s2){
        //不知道该方法为什么会出现数组越界，非逼我用数组解决
        if(s1.length() == 0) return s2;
        if(s2.length() == 0) return s1;
        BigInteger bi1 = new BigInteger(s1);
        BigInteger bi2 = new BigInteger(s2);
        return bi1.add(bi2).toString();
    }
}
