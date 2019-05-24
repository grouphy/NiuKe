package printnum;

import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:输入n个数，其中一个数的个数大于等于n/2，请输出那个数
 * User:Mr.Du
 * Date:2019-05-24
 * Time:23:16
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组大小");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if(n%2 == 0 &&arr[n/2-1] == arr[0]){
            System.out.println(arr[0]);
        }else{
            System.out.println(arr[n/2]);
        }

        code(arr,n);

    }

    /**
     *
     * @param arr  传入数组
     * @param n    数组长度
     */
    public static void code(int[] arr,int n){
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i = 0;i<n;i++){
            if(!mp.containsKey(arr[i])){
                int count = 0;
                mp.put(arr[i],++count);
                for(int j = i+1;j<n;j++){
                    if(arr[j] == arr[i]){
                        mp.put(arr[j],++count);
                    }
                }
            }
        }
        for(Map.Entry<Integer,Integer> e : mp.entrySet()){
            if(e.getValue()>n/2 && n%2 == 1 || e.getValue()>=n/2 && n%2 == 0){
                System.out.println(e.getKey());
                return;
            }
        }
    }
}
