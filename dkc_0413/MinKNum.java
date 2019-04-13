package Offer.dkc_0413;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-13
 * Time:17:02
 */
public class MinKNum {
    public static void main(String[] args) {
        int[] array = {1,3,4,5,2,6,8,7};
        System.out.println(GetLeastNumbers_Solution(array,4));
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Set set = new TreeSet();
        ArrayList<Integer> list1= new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i:input){
            set.add(i);
        }
        list1.addAll(set);
        if(k>list1.size()||list1.size() == 0) return null;
        for(int i = 0;i<k;i++){
            list.add(list1.get(i));
        }
        return list;
    }
}
