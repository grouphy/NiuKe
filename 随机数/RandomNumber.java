package dkc_0405;

import java.util.*;

public class RandomNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = r.nextInt(1000)+1;
        }
        Arrays.sort(arr);
        dupArr(arr);
        
	}
	
	public static void dupArr(int[] arr) {
		int i = 0;
		for(int j = 1;j<arr.length;j++) {
			if(arr[j] != arr[i]) {
				i++;
				arr[i] = arr[j];
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int k = 0;k<i+1;k++) {
			System.out.print(arr[k]+" ");
		}
	}
}
