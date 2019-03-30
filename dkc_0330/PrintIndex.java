package dkc_0330;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 	根据输入的字符串判断字符串中数字的位置。
	输入描述:
		输入第一行表示测试用例的个数m，接下来m行每行以个字符串，字符串长度不超过50。
	输出描述:
		输出m行。每行输出一行数字，用空格隔开，按顺序表示字符串中出现的数字的位置。
	示例1
		输入
			1
			a3b4c5
		输出
			2 4 6
 */
public class PrintIndex {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i = 0;i<m;i++){
            String s = sc.next();
            if(s.length()>50) return;
            list.add(s);
        }
        for(int i = 0;i<list.size();i++){
            for(int j = 0;j<list.get(i).length();j++){
                if(list.get(i).charAt(j)>='0'&&list.get(i).charAt(j)<='9'){
                    System.out.print((j+1)+" ");
                }
            }
            System.out.println();
        }
	}
}
