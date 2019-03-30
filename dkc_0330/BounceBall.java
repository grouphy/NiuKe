package dkc_0330;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 	一个小球，从高为H的地方下落，下落弹地之后弹起高度为下落时的一半，比如第一次弹起高度为H/2，
 	如此往复，计算从小球H 高度下落到第n 次弹地往返的总路程。
 	输入描述:
		输入第一行为样例数m，接下来m行每行两个整数H和n，n不超过5。
	输出描述:
		输出m行，表示所求总路程，结果保留小数点后两位。
	输入
		1
		5 2
	输出
		10.00
 */
public class BounceBall {
	public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i = 0;i<m;i++){
            int h = sc.nextInt();
            int n = sc.nextInt();
            if(n>5) return;
            list.add(h);
            list.add(n);
        }
        for(int i = 0;i<list.size();i+= 2){
            double init = list.get(i);
            double ret = init;
            int t = list.get(i+1);
            while(t-1>0){
                ret += init;
                init /= 2;
                t--;
            }
            System.out.printf("%.2f\n",ret);
        }
    }
}
