package PAT;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-10
 * Time:17:12
 */
public class AaddBisGreaterC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] arr = new long[n][3];
        for(int i = 0;i<n;i++){
            arr[i][0] = sc.nextLong();
            arr[i][1] = sc.nextLong();
            arr[i][2] = sc.nextLong();
        }
        for(int i = 0;i<n;i++){
            long t =arr[i][0] + arr[i][1] - arr[i][2];
            if(t>0){
                System.out.println("Case #"+(i+1)+": "+"true");
            }else{
                System.out.println("Case #"+(i+1)+": "+"false");

            }
        }

    }
}
