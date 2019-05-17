package Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:渣渣超无聊，模拟洗牌，自己一人发两副牌，左右分别拿n张，前n张牌在左手
 * 后n张牌在右手，然后先放右手最后一张牌，
 * 在放左手最后一张牌就这样重复的放，直到左右手都没有牌，然后从刚放下的牌的顶部拿牌，
 * 渣渣超最后得到洗好的牌
 * 第一行输入t表示有几组数据
 * 第二行输入n、k分别表示一个手有多少张牌，k表示重复了几次
 * 第三行输入牌
 * 例如输入：
 * 1
 * 3 1
 * 1 2 3 4 5 6
 * 输出：
 * 1 5 3 6 3 6
 * User:Mr.Du
 * Date:2019-05-17
 * Time:18:36
 */
public class TestDemo {
    //3 3 1 1 2 3 4 5 6 3 2 1 2 3 4 5 6 2 2 1 1 1 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int t = sc.nextInt();
        while(t>0){
            List<Integer> l = new ArrayList<Integer>();
            int n = sc.nextInt();
            l.add(sc.nextInt());
            for(int i = 0;i<2*n;i++){
                l.add(sc.nextInt());
            }
            list.add(l);
            t--;
        }
        for(List<Integer> l : list){
            int tmp = l.get(0);
            while(tmp>0){
                List<Integer> l1 = new ArrayList<Integer>();
                for(int i = 1,j = l.size()/2+1;i<=l.size()/2&&j<l.size();i++,j++){
                    l1.add(l.get(i));
                    l1.add(l.get(j));
                }
                for(int i = 0;i<l1.size();i++){
                    l.set(i+1,l1.get(i));
                }
                tmp--;
            }
            for(int i = 1;i<l.size();i++){
                if(i == l.size()-1){
                    System.out.println(l.get(i));
                }else {
                    System.out.print(l.get(i)+" ");
                }
            }
        }

    }
    public static void mein(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> l = new ArrayList<Integer>();
        for(int i = 0;i<10;i++){
            list.add(i+1);
        }
        for(int i = 10;i<20;i++){
            l.add(i+1);
        }
        list = l;
        System.out.println(list);
    }
}
