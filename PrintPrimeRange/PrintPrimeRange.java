package PAT;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-10
 * Time:18:14
 */
public class PrintPrimeRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        int sign = 0;
        for(int i = 2;i<Integer.MAX_VALUE;i++){
            if(isPrime(i)){
                count++;
                if(count>=m){
                    if(n == count){
                        System.out.println(i);
                        break;
                    }
                    sign++;
                    if(sign%10 == 0){
                        System.out.println(i);
                    }else{
                        System.out.print(i+" ");
                    }
                }
            }
        }

    }
    public static boolean isPrime(int n){
        for(int i = 2;i<=(int)Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

}
