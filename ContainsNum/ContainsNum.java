package PAT;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-10
 * Time:20:37
 */
public class ContainsNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int dA = sc.nextInt();
        int B = sc.nextInt();
        int dB = sc.nextInt();

        String pA = "";
        String pB = "";

        String sA = ""+A;
        String sB = ""+B;

        char cA = (char)(dA+'0');
        char cB = (char)(dB+'0');

        for(int i = 0;i<sA.length();i++){
            if(sA.charAt(i) == cA){
                pA = pA + cA;
            }
        }
        for(int i = 0;i<sB.length();i++){
            if(sB.charAt(i) == cB){
                pB = pB + cB;
            }
        }
        if(pA == "" || pB == "") System.out.println(0);
        else System.out.println(Integer.valueOf("")+Integer.valueOf(""));

    }
}
