package reverseword;

import java.util.Stack;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-18
 * Time:8:44
 */
/*
给定一个字符串，逐个翻转字符串中的每个单词。

示例 1：

输入: "the sky is blue"
输出: "blue is sky the"
示例 2：

输入: "  hello world!  "
输出: "world! hello"
解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
示例 3：

输入: "a good   example"
输出: "example good a"
解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。


说明：

无空格字符构成一个单词。
输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 */
public class ReverseWords {
    public static void main(String[] args) {

        System.out.println(reverseWords(" a b  c     d e f"));//d c b a;
    }
    public static String reverseWords(String s){
        StringBuffer sb = new StringBuffer();
        s = s.trim();
        String[] str = s.split(" ");

        Stack<String> stack = new Stack<String>();
        for(String ss:str){
            stack.push(ss);
        }
        int t = stack.size();
        for(int i = 0;i<t;i++){
            if(stack.peek().equals("")){
                stack.pop();
            }else {
                sb.append(stack.pop() + " ");
            }

        }
        return sb.toString().trim();
    }
}
