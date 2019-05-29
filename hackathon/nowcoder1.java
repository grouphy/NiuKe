package hackathon;
import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-05-29
 * Time:16:47
 */
public class nowcoder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int count = 0;
            int n = sc.nextInt();
            for(int i = 1;i<=n;i++){
                if(isP(i)){
                    System.out.print(i+" ");
                    count++;
                }
            }
            System.out.println();
            System.out.println(n+"中的素数个数有:"+count+"个");
        }
    }

    public static boolean isP(int n){
        if(n == 1) return false;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
