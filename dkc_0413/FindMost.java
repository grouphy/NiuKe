package Offer.dkc_0413;

import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-13
 * Time:15:18
 */
public class FindMost {
    public static void main(String[] args) {
        int[] array = {1,2,2,3,5,2,2,4,2};
        int t = m(array);
        System.out.println(t);
    }
    public static int m(int[] array) {
        int len = array.length;
        if(len<1) return 0;
        Arrays.sort(array);
        int num = array[len/2];
        int count = 0;
        for(int i = 0;i<len;i++)
            if(num == array[i])
                count++;
        if(count<=len/2)return 0;
        return num;
    }
}
