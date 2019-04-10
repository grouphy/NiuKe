package PAT;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-10
 * Time:18:51
 */
public class GetTime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = new String[4];
        for(int i = 0;i<4;i++){
            str[i] = sc.next();
        }
        int j = 0;
        int index = 0;
        //ch1表示周几，ch2表示小时，ss表示分
        char ch1 = '0';
        for(j = 0;j<str[0].length();j++){
            if(str[0].charAt(j) == str[1].charAt(j) && str[0].charAt(j)>64&&str[0].charAt(j)<91){
                ch1 = str[0].charAt(j);
                break;
            }
        }
        char ch2 = '0';
        for(j = j+1;j<str[0].length();j++){
            if(str[0].charAt(j) == str[1].charAt(j)){
                ch2 = str[0].charAt(j);
                break;
            }
        }

        String ss = "";
        for(int i = 0;i<str[2].length();i++){
            if(str[2].charAt(i) == str[3].charAt(i) && str[2].charAt(i)>96&&str[3].charAt(i)<123){
                int t = str[2].substring(0,i).length();
                if(t>9){
                    ss = ss + t;
                }else{
                    ss = "0" + t ;
                }

                break;
            }
        }
        String[] s = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        System.out.print(s[ch1 - 65]+" ");
        if(ch2<65){
            System.out.print(("0"+(ch2-'0'))+":"+ss);
        }else{
            System.out.print((ch2-55)+":"+ss);
        }
    }
}
