package dkc_0329;
/*
 	设N是一个四位数，它的9倍恰好是其反序数（例如：1234 的反序数是4321），求N的值。
 */
public class PrintN {
	public static void main(String[] args){
        for(int i = 1000;i<1111;i++){
            if(i*9 == reverse(i)){
                System.out.println(i);
            }
        }
    }
    public static int reverse(int n){
        int ret = 0;
        while(n!=0){
            ret = ret * 10 + n%10;
            n /= 10;
        }
        return ret;
    }
}
