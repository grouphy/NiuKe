package beibao;
import java.io.*;
/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/7/11
 * Time:23:44
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        long w = Long.valueOf(s[1]);
        String[] s1 = bufferedReader.readLine().split(" ");
        long[] arr = new long[s1.length];
        for (int i = 0; i < s1.length; i++) {
            arr[i] = Long.valueOf(s1[i]);
        }
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if(sum <= w){
            System.out.println((long)Math.pow(2,arr.length));
            return;
        }

        System.out.println(loop(arr, arr.length - 1, w));
    }

    public static int loop(long[] arr, long i, long w) {
        if(i == 0) {
            if(w >= arr[0]) {
                return 2;
            }else {
                return 1;
            }
        }
        if(w == 0) {
            return 1;
        }
        if(w - arr[(int)i] >= 0) {
            return loop(arr, i - 1, w - arr[(int)i]) + loop(arr, i - 1, w);
        }else {
            return loop(arr, i - 1, w);
        }
    }
}
