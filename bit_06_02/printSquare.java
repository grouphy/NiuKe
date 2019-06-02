package bit_06_02;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-06-02
 * Time:23:29
 */
public class printSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char c = s.charAt(0);
        int m = Math.round(0.5f*n);
        char[][] arr = new char[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = ' ';
                if(i == 0||i == m-1){
                    arr[i][j] = c;
                }else if(j == 0 || j == n-1){
                    arr[i][j] = c;
                }
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
