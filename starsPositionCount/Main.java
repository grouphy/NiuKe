package starsPositionCount;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-05-15
 * Time:21:29
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[][] arr1 = new int[m][m];
        for(int i = 0;i<m;i++){
            arr1[i][0] = sc.nextInt();
            arr1[i][1] = sc.nextInt();
            arr1[i][2] = sc.nextInt();
            arr1[i][3] = sc.nextInt();
        }
        for(int i = 0;i<m;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(arr[j][0]>=arr1[i][0]&&arr[j][1]>=arr1[i][1]
                    &&arr[j][0]<=arr1[i][2]&&arr[j][1]<=arr1[i][3])
                    count++;
            }
            System.out.println(count);
        }
    }
}
