package PAT;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-10
 * Time:20:48
 */
public class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String m = sc.next();
        BigInteger bi1 = new BigInteger(s);
        BigInteger bi2 = new BigInteger(m);
        BigInteger bi4 = bi1.divide(bi2);
        BigInteger bi3 = bi1.mod(bi2);
        System.out.println(bi4 + " " + bi3);
    }
}
