package counthuiwenNum;
import java.util.*;
/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-05-20
 * Time:20:34
 */

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int count = 0;
        if(isPar(b+a,0,b.length()+a.length()-1)){
            count++;
        }
        for(int i = 1;i<a.length();i++){
            if(isPar(a.substring(0,i)+b+a.substring(i),0,b.length()+a.length()-1)){
                count++;
            }
        }
        if(isPar(a+b,0,b.length()+a.length()-1)){
            count++;
        }
        System.out.println(count);
    }

    public static boolean isPar(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}