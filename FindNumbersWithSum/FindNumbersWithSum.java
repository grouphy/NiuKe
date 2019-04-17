package Offer.dkc_0417;

import java.util.ArrayList;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-17
 * Time:20:05
 */
/*
题目描述
输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class FindNumbersWithSum {

    public static void main(String[] args) {
        ArrayList<Integer> list = findNumbersWithSum1(new int[]{1,2,3,4,5,6,7,8,9,10},10);
        System.out.println(list);
    }
    //方法二
    public static ArrayList<Integer> findNumbersWithSum1(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int min = 0;
        int count = 0;
        int s = 0;
        int e = array.length - 1;
        while(s<e){
            if(array[s] + array[e] == sum&&count == 0){
                list.add(array[s]);
                list.add(array[e]);
                min = array[s]*array[e];
                count++;
                s++;
            }else if(array[s] + array[e] == sum){
                if(min>array[s]*array[e]){
                    list.clear();
                    list.add(array[s]);
                    list.add(array[e]);
                    min = array[s]*array[e];
                }
                s++;
            }else if(array[s]+array[e]>sum){
                e--;
            }else{
                s++;
            }
        }
        return list;
    }
    //方法一
    public static ArrayList<Integer> findNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max = 0;
        int s = 0;
        int e = array.length - 1;
        while(s<e){
            if(array[s] + array[e] == sum){
                list.add(array[s]);
                list.add(array[e]);
                s++;
            }else if(array[s]+array[e]>sum){
                e--;
            }else{
                s++;
            }
        }
        System.out.println(list);
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i = 0;i<list.size() - 1;i+=2){
            l.add(list.get(i)*list.get(i+1));
        }
        System.out.println(l);
        int min = l.get(0);
        System.out.println(min);
        s = 0;
        for(int i = 1;i<l.size();i++){
            if(min>l.get(i))
                s = i+2;
        }
        l.clear();
        l.add(list.get(s));
        l.add(list.get(s+1));
        return l;
    }
}
