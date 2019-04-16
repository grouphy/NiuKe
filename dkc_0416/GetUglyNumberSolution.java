package Offer.dkc_0416;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-16
 * Time:15:22
 */
/*
三指针法。只计算丑数，而不计算非丑数。丑数=丑数*（2/3/5），所以创建数组保存有序的丑数。
关键在于如何在计算丑数的过程中保持数组有序。当前的丑数必然是之前某一个丑数*因子的结果，
但是不需要每个数都要乘一遍2、3、5。要获得的丑数必然是大于现在已有的，
在计算得出丑数中选择一个最小的放入数组中，来保持数组的有序，因为新放入的丑数是根据之前的丑数计算得到的，
所以必然是有序的。为了每次新得到的三个丑数都是比已有丑数大，且最小，所以要记录各个因子下次计算要使用的已有丑数在什么位置，
否则就会出现跳数，比如已有{1,2,3,4}，我们知道下一个丑数应该是5，但是如果因子5没有选择第一个丑数1来相乘，就会漏掉5这个丑数。

 */
public class GetUglyNumberSolution {

    public static void main(String[] args) {
        System.out.println(getUglyNumber(1000));
    }

    public static int getUglyNumber(int n) {
        int a = 0;
        int b = 0;
        int c = 0;
        int[] arr = new int[n];
        arr[0] = 1;
        for(int i = 1;i<n;i++){
            int r = arr[a]*2;
            int s = arr[b]*3;
            int t = arr[c]*5;
            int sign = Math.min(r,Math.min(s,t));
            arr[i] = sign;
            if(sign%2==0){
                a++;
            }
            if(sign%3==0){
                b++;
            }
            if(sign%5==0){
                c++;
            }
        }
        return arr[n-1];
    }
}
