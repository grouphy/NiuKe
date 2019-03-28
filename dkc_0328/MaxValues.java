package dkc_0328;

import java.util.Scanner;
/*
 	玥玥带乔乔一起逃亡，现在有许多的东西要放到乔乔的包里面，但是包的大小有限，所以我们只能够在里面放入非常重要的物品。
 	现在给出该种物品的数量、体积、价值的数值，希望你能够算出怎样能使背包的价值最大的组合方式，并且输出这个数值，乔乔会非常感谢你。
	输入描述:
		第1行有2个整数，物品种数n和背包装载体积v；
		第2行到i+1行每行3个整数，为第i种物品的数量m、体积w、价值s。
	input: 2 10
		   3 4 3
		   2 2 5
	output:13
 */
public class MaxValues {
	public static void main(String[] args){
        System.out.println(getMaxValues1());
    }
	//暴力法
	public static int getMaxValues(){
		Scanner sc = new Scanner(System.in);
        //数量
        System.out.println("请输入数量:");
        int sum = sc.nextInt();
        //价值
        System.out.println("请输入价值:");
        int v = sc.nextInt();
        //定义三个一维数组分别表示m,w,s
        int[] m = new int[sum];
        int[] w = new int[sum];
        int[] s = new int[sum];
        for(int i = 0;i<sum;i++){
            m[i] = sc.nextInt();
            w[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }
        
        int maxValues = 0;
        while(v>0){
        	int mmp = 0;
        	for(int i : s) {
        		if(i == 0) {
        			mmp++;
        		}
        	}
        	if(mmp == sum) break;
            int max = 0;
            //记录最大值下标
            int sign = 0;
            for(int i = 0;i<sum;i++){
                if(max<s[i]){
                    max = s[i];
                    sign = i;
                }
            }
            int count = v / w[sign];
            if(count == 0){
                s[sign] = 0;
            }else if(count < m[sign]){
                maxValues += count * s[sign];
                v = v-count * w[sign];
                s[sign] = 0;

            }else if(count > m[sign]){
                maxValues += m[sign] * s[sign];
                v =v- m[sign] * w[sign];
                s[sign] = 0;
            }
        }
        return maxValues;
	}
	
	//动态规划
	public static int getMaxValues1() {
		Scanner sc = new Scanner(System.in);
        //数量
        System.out.println("请输入数量:");
        int sum = sc.nextInt();
        //价值
        System.out.println("请输入价值:");
        int v = sc.nextInt();
        //定义三个一维数组分别表示m,w,s
        int[] m = new int[sum];
        int[] w = new int[sum];
        int[] s = new int[sum];
        System.out.println("m w s");
        for(int i = 0;i<sum;i++){
            m[i] = sc.nextInt();
            w[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }
        int[] dp = new int[2010];
        for(int i = 0;i<sum;i++) {
        	for(int j = v;j>w[i];j--) {
        		for(int k = 1;k<=m[i]&&k*w[i]<=j;k++) {
        			dp[j] = (int)Math.max(dp[j], dp[j-k*w[i]]+k*s[i]);
        		}
        		System.out.println("dp[j] = "+dp[j]+" ,j = "+j);
        	}
        }
		return dp[v];
	}
	
}
