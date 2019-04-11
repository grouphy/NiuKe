package PAT.dkc04_11;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-11
 * Time:6:34
 */
public class RockPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入这块不能用sc.nextInt(),这样输入不符合要求
        int n = Integer.valueOf(sc.nextLine());
        String[] s = new String[n];
        for(int i = 0;i<n;i++){
            s[i] = sc.nextLine();
        }
        String[][] str = new String[n][2];
        for(int i = 0;i<n;i++){
            str[i] = s[i].split(" ");
        }
        int winA = 0;
        int winB = 0;
        //统计两个玩家各种手势出现的次数
        int cB = 0;
        int cC = 0;
        int cJ = 0;
        int cB2 = 0;
        int cC2 = 0;
        int cJ2 = 0;
        for(int i = 0;i<n;i++){
            if((str[i][0].equals("B") && str[i][1].equals("C")) || (str[i][0].equals("C") && str[i][1].equals("J"))
                    || (str[i][0].equals("J") && str[i][1].equals("B"))   ) {
                winA++;
                if(str[i][0].equals("B")) cB++;
                if(str[i][0].equals("C")) cC++;
                if(str[i][0].equals("J")) cJ++;

            }
            if((str[i][0].equals("B") && str[i][1].equals("J")) || (str[i][0].equals("J") && str[i][1].equals("C"))
                    || (str[i][0].equals("C") && str[i][1].equals("B"))     ) {
                winB++;
                if(str[i][1].equals("B")) cB2++;
                if(str[i][1].equals("C")) cC2++;
                if(str[i][1].equals("J")) cJ2++;
            }
        }
        char c1 = cB>=cC?(cB>=cJ?'B':'J'):(cC>=cJ?'C':'J');
        char c2 = cB2>=cC2?(cB2>=cJ2?'B':'J'):(cC2>=cJ2?'C':'J');
        int draw = n - winA - winB;
        System.out.println(winA+" "+draw+" "+winB);
        System.out.println(winB+" "+draw+" "+winA);
        System.out.println(c1+" "+c2);
    }
}
