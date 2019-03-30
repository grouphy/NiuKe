package dkc_0330;
import java.util.*;
/*
 	请输入字符串，最多输入4 个字符串，要求后输入的字符串排在前面，例如
	输入：EricZ
	输出：1=EricZ
	输入：David
	输出：1=David 2=EricZ
	输入：Peter
	输出：1=Peter 2=David 3=EricZ
	输入：Alan
	输出：1=Alan 2=Peter 3=David 4=EricZ
	输入：Jane
	输出：1=Jane 2=Alan 3=Peter 4=David
 */
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        int m = sc.nextInt();
        if(m>100) return;
        for(int j = 0;j<m;j++){
            int count = 0;
            String s = sc.next();
            if(s.length()>20) return;
            list.add(0,s);
            for(int i = 0;i<list.size();i++){
                if(count>3) break;
                System.out.print((i+1)+"="+list.get(i)+" ");
                count++;
            }
            System.out.println();
        }
    }
}
