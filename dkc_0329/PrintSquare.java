package dkc_0329;

public class PrintSquare {
	public static void main(String[] args){
        for(int i = 1;i<256;i++){
            if(reverse(i*i)){
                System.out.println(i);
            }
        }
        
    }
    public static boolean reverse(int n){
        int tmp = n;
        int ret = 0;
        while(n!=0){
            ret = ret * 10 + n%10;
            n /= 10;
        }
        if(ret == tmp) return true;
        return false;
    }
}
