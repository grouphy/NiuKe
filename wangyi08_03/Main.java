package wangyi08_03;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/3
 * Time:15:42
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = 0;
        while(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i = 0;i<t;i++){
                int n =sc.nextInt();
                int[] arr = new int[n];
                for(int k = 0;k<n;k++){
                    arr[k] = sc.nextInt();
                }
                boolean b = true;
                for(int j = 0;j<n;j++){
                    if(j == 0){
                        tmp = arr[n-1] + arr[j+1];
                    }else if(j == n - 1){
                        tmp = arr[0] + arr[j - 1];
                    }else{
                        tmp = arr[j-1] + arr[j+1];
                    }
                    if(tmp<arr[j]) {
                        System.out.println("NO");
                        b = false;
                        break;
                    }
                }
                if(b) System.out.println("YES");
            }
        }
    }
}
