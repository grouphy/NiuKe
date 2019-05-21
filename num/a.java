package dkc;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:输出字符串中数字最长的字符串
 * User:Mr.Du
 * Date:2019-05-21
 * Time:18:54
 */

public class a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        String str = "";
        for(int i = 0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }else{
                str = str.length()>sb.length()?str:sb.toString();
                sb = new StringBuffer();
            }
        }
        str = str.length()>sb.length()?str:sb.toString();
        System.out.println(str);
    }
}
