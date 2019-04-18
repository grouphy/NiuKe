package Offer.dkc_0418;

import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-18
 * Time:17:54
 */
public class IsContinuous {

    public static void main(String[] args) throws ClassNotFoundException {
        Class classz = Class.forName("Offer.dkc_0418.IsContinuous");
        System.out.println(classz.getName());
        Random r = new Random();
        int[] numbers = new int[56];
        for(int i = 0;i<56;i++){
            numbers[i] = r.nextInt(13)+1;
        }
        List<Integer> list = new ArrayList<Integer>();
        while(list.size()<5){
            int t = numbers[r.nextInt(56)];
            if(!list.contains(t)){
                list.add(t);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.size());
    }
    public static boolean isContinuous(int[] numbers){
        return false;
    }
}
