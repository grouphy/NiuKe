package Offer.dkc_0417;

import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-17
 * Time:19:02
 */
/*
一个数组中有两个数只出现一次，请输出
 */
public class FindNumsAppearOnce {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findNumsAppearOnce(new int[]{1,2,3,4,4,5,6,6,7,7})));
        int sum = 0;
        for(int i = 1;i<15;i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public static int[] findNumsAppearOnce(int[] arr){
        int i = 0;
        int count = 0;
        int[] array = new int[2];
        while(i<arr.length){
            if(arr[i] == arr[i+1]){
                i+=2;
            }else if(count == 0){
                array[0] = arr[i];
                i++;
                count++;
            }else{
                array[1] = arr[i];
                break;
            }
        }
        return array;
    }

}
