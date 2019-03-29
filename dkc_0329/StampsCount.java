package dkc_0329;

import java.util.HashSet;
import java.util.Set;

/*
 	某人有8 角的邮票5 张，1 元的邮票4 张，1 元8 角的邮票6 张，用这些邮票中的一张或若干张可以得到多少中不同的邮资？
 */
public class StampsCount {
	public static void main(String[] args){
        Set<Integer> set = new HashSet<Integer>();
        int a = 8;
        int b = 10;
        int c = 18;
        int sum = 0;
        for(int i = 0;i<=5;i++){
            for(int j = 0;j<=4;j++){
                for(int k = 0;k<=6;k++){
                    sum = i*a+j*b+k*c;
                    set.add(sum);
                }
            }
        }
        //没有0*0*0，所以要减去一
        System.out.println(set.size()-1);
    }
}
