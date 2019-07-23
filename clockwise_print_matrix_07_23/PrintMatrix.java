package Offer.clockwise_print_matrix_07_23;

import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，
 * 如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * User:Mr.Du
 * Date:2019/7/23
 * Time:11:04
 */
public class PrintMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12}
                       };
        System.out.println(printMatrix(arr));
    }
    public static ArrayList<Integer> printMatrix(int [][] array) {
        ArrayList<Integer> list = new ArrayList<> ();
        if(array.length==0) return list;
        int n = array.length;   //行
        int m = array[0].length ; //列
        int i = 0;  //行
        int j = 0;  //列
        while(i<m&&j<n){
            for(int a = j;a<m;a++) list.add(array[i][a]);
            for(int b = i+1;b<n;b++) list.add(array[b][m-1]);
            for(int a = m - 2;a>=i&&n-1!=i;a--) list.add(array[n-1][a]);
            for(int b = n-2;b>i&&m-1!=j;b--) list.add(array[b][j]);
            i++;
            j++;
            m--;
            n--;

        }
        return list;
    }
}
