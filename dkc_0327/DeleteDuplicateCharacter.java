package dkc_0327;

import java.util.Scanner;
/*
 	牛牛有一个由小写字母组成的字符串s,在s中可能有一些字母重复出现。比如在"banana"中,字母'a'和字母'n'分别出现了三次和两次。
但是牛牛不喜欢重复。对于同一个字母,他只想保留第一次出现并删除掉后面出现的字母。请帮助牛牛完成对s的操作。

	输入:		banana
	输出：ban
 */
public class DeleteDuplicateCharacter {
	public static void main(String[] args) {
		int[] arr = new int[26];
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int count = 0;
        for(char i : chars){
            if(arr[i-'a'] == 0){
                arr[i-'a'] = 1;
                count++;
            }
        }
        char[] chars1 = new char[count];
        int index = 0;
        for(char i : chars){
            if(arr[i-'a'] == 1){
                chars1[index++] = i;
                arr[i-'a'] = 0;
            }
        }
        System.out.println(new String(chars1));
	}
}
