package Offer.dkc_0420;

import java.util.ArrayList;
/*
给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
{[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}，
 {2,3,4,2,6,[2,5,1]}。
 */
/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-20
 * Time:21:59
 */
public class MaxInWindows {

    public static void main(String[] args) {
        System.out.println(maxInWindows(new int[]{1,2,3,4,5,6},5));
    }

    public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(num.length == 0 || size == 0) return list;
        if(size == 1){
            for(int i:num){
                list.add(i);
            }
            return list;
        }
        for(int i = 0;i<num.length - size + 1;i++){
            int j = i + size;
            int max = num[i];
            for(int m = i;m<j;m++){
                max = Math.max(num[m],max);
            }
            list.add(max);
        }
        return list;
    }
}
