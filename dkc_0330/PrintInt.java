package dkc_0330;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 	写一个类，能接受int 型的变量，接收变量后能存储原变量（譬如12345）和其反向变量(54321)，最多处理数量为10 个，
 	当输入达到10 个或者输入变量为0 的时候停止。并且在类销毁前输出存储的所有变量。
 	输入描述:
		输入若干个整数。
	输出描述:
		按类里存储的数个数m输出m行。每行两个数，表示原变量及其反向变量。
	输入
		12 3442 0
	输出
		12 21
		3442 2443
 */
public class PrintInt {
	public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while(list.size()<10){
            int in = sc.nextInt();
            if(in == 0) break;
            list.add(in);
        }
        for(int i = 0;i<list.size();i++){
            int tmp = list.get(i);
            int ret = 0;
            //逆序
            while(tmp!=0){
                ret = ret*10+tmp%10;
                tmp /= 10;
            }
            System.out.print(list.get(i)+" "+ret);
            System.out.println();
        }
    }
}
