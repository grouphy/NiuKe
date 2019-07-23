package Offer.print_matrix_with_z_07_23;

import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:以Z字型打印矩阵
 * 给定矩阵如下：
 *  1   2   3   4
 *  5   6   7   8
 *  9   10  11  12
 *  13  14  15  16
 *  打印结果如下：
 *  1   2   5   9  6   3   4    7   10  13  14  11  8   12  15  16
 *
 * User:Mr.Du
 * Date:2019/7/23
 * Time:12:31
 */
public class Main {
    public static void main(String[] args) {
        int[][] arr = { {1},{2},{3},{4}/*,
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}*/
        };
        System.out.println(printMatrixInZ(arr));
    }

    public static ArrayList<Integer> printMatrixInZ(int[][] arr){
        ArrayList<Integer> list = new ArrayList<>();
        if(arr.length == 0) return list;
        int m = arr.length;     //行
        int n = arr[0].length;  //列
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        boolean bool = false;
        int count = m + n - 1;
        while(count!=0){
            if(bool){
                //从右上角到左下角
                int j = y1;
                for(int i = x1;i<=x2;i++){
                    list.add(arr[i][j--]);
                }
            }else{
                //从左下角到右上角
                int j = y2;
                for(int i = x2;i>=x1;i--){
                    list.add(arr[i][j++]);
                }
            }
            y1++;
            x2++;
            count--;
            if(y1>=n){
                y1 = n - 1;
                x1++;
            }
            if(x2>=m){
                x2 = m - 1;
                y2++;
            }
            bool = !bool;
        }

        return list;

    }
}
