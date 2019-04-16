package Offer.dkc_0416;

import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-16
 * Time:23:08
 */
public class FirstNotRepeatingChar {
    public static void main(String[] args) {
        String str = "AWAheh";


        System.out.println(firstNotRepeatingChar(str));
    }
    public static int firstNotRepeatingChar(String str){
        int[] arr = new int[52];
        char[] chars = str.toCharArray();
        int len = chars.length;
        for(int i = 0;i<len;i++){
            if(chars[i]>64&&chars[i]<91){
                arr[chars[i]-65] += 1;
            }else{
                arr[chars[i]-97+26] += 1;
            }
        }
        for(int i = 0;i<len;i++){
            if(chars[i]>64&&chars[i]<91){
                if(arr[chars[i]-65] == 1)
                    return i;
            }else{
                if(arr[chars[i]-97+26] == 1)
                    return i;
            }
        }
        System.out.println(Arrays.toString(arr));
        return -1;
    }
}
