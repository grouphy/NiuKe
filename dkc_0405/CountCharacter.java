package dkc_0405;

import java.util.Scanner;
/*
 	题目描述
		写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
	输入描述:
		输入一个有字母和数字以及空格组成的字符串，和一个字符。
	输出描述:
		输出输入字符串中含有该字符的个数。
 */
public class CountCharacter {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().toLowerCase().charAt(0);
        s = s.toLowerCase();
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        System.out.println(count);
    }
}
