package hackathon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * User:Mr.Du
 * Date:2019-05-29
 * Time:17:14
 */
public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            int m = s.length()/8;
            int n = s.length()%8;
            if(m == 0){
                System.out.println(s+"00000000".substring(n));
            }else{
                for(int i = 0;i<m;i++){
                    System.out.println(s.substring(i*8,i*8+8));
                }
                if(n!=0)
                    System.out.println(s.substring(s.length()-n)+"00000000".substring(n));
            }
        }

    }

}
