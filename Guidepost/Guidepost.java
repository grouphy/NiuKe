package PAT.dkc04_11;

import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-11
 * Time:13:22
 */


public class Guidepost {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                String NM = sc.next();
                String c1 = sc.next();
                String c2 = sc.next();
                String MN = new StringBuffer(NM).reverse().toString();
                boolean f1 = look(NM, c1, c2);
                boolean f2 = look(MN, c1, c2);
                if (f1 && f2) {
                    System.out.println("both");
                } else if (f1 && !f2) {
                    System.out.println("forward");
                } else if (!f1 && f2) {
                    System.out.println("backward");
                } else {
                    System.out.println("invalid");
                }
            }
        }

        public static boolean look(String NM, String c1, String c2) {
            int len = NM.length();
            int len1 = c1.length();
            int len2 = c2.length();
            int i = 0;
            for (; i <= len - len1 - len2; i++) {
                if (NM.substring(i, i + len1).equals(c1)) {
                    break;
                }
            }
            if (i > len - len1 - len2) {//没有找到子串一
                return false;
            }
            for (++i; i <= len - len2; i++) {
                if (NM.substring(i, i + len2).equals(c2)) {
                    break;
                }
            }
            if (i > len - len2) {//没有找到子串二
                return false;
            }
            return true;
        }
}

