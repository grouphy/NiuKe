package deletezifu;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-05-22
 * Time:21:54
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s = "";
        for(int i = 0;i<s1.length();i++){
            if(!s2.contains(""+s1.charAt(i))){
                s = s + s1.charAt(i);
            }
        }
        System.out.println(s);
    }
}
