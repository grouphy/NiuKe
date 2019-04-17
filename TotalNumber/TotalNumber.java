package Offer.dkc_0417;

import java.util.Arrays;
import java.util.Random;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-17
 * Time:17:38
 */
/*
找出某一个值在数组中出现的次数
 */
public class TotalNumber {
    public static void main(String[] args) {
        int[] array = new int[200000000];
        Random r = new Random();
        for(int i = 0;i<array.length;i++){
            array[i] = r.nextInt(10000)+1;
        }
        Arrays.sort(array);
        System.out.println(GetNumberOfK(array,9999));
        System.out.println(countK(array,9999));
    }
    public static int countK(int[] arr,int k){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == k){
                count++;
            }
        }
        return count;
    }
    public static int GetNumberOfK(int [] array , int k) {
        int count = 1;
        int index = binarySearch(array,k);
        if(index == -1) return 0;
        System.out.println("index  ="+index);
        for(int i = index-1;i>=0;i--){
            if(array[i] == k){
                count++;
            }else{
                break;
            }
        }
        for(int i = index+1;i<array.length;i++){
            if(array[i] == k){
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    public static int binarySearch(int[] arr,int k){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = (e - s) / 2 + s;
            if(arr[mid] == k){
                return mid;
            }else if(arr[mid]<k){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return -1;
    }
}
