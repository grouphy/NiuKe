package dkc_0329;
/*
 	一个数如果恰好等于它的各因子（该数本身除外）子和，如：6=3+2+1，则称其为“完数”；若因子之和大于该数，则称其为“盈数”。
 	求出2 到60 之间所有“完数”和“盈数”，并以如下形式输出： E: e1 e2 e3 ......(ei 为完数) G: g1 g2 g3 ......(gi 为盈数)
 */
public class PrintAdd {
	public static void main(String[] args){
		System.out.print("E: ");
        for(int i = 2;i<61;i++){
            if(add(i) == i){
                System.out.print(i+" ");
            }
        }
        System.out.print("G :");
        for(int i = 2;i<61;i++){
            if(add(i) > i){
                System.out.print(i+" ");
            }
        }
        
    }
    public static int add(int n){
        int t = (int)Math.sqrt(n);
        int ret = 1;
        for(int i = 2;i<=t;i++){
            if(n%i == 0){
                ret += i;
                if(i != n/i) {
                	ret += n/i;
                }
            }
        }
        return ret;
    }
	
}
