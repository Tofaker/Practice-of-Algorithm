import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-22;   Time: 20:15
 */

//Character.isLetter(c)  判断是否是字母，是返回true


public class 仅仅反转字母 {
    public String reverseOnlyLetters(String S) {//反转指针法
        StringBuilder sb = new StringBuilder();
        int j = S.length()-1;
        int i = 0;
        while (i < S.length()){
            if (Character.isLetter(S.charAt(i))){
                while (!Character.isLetter(S.charAt(j))){
                    j--;
                }
                sb.append(S.charAt(j--));
            }else {
                sb.append(S.charAt(i));
            }
            i++;
        }
        return sb.toString();


    }

    public String reverseOnlyLetters1(String S) {//字母栈法
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (Character.isLetter(c)){
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c: S.toCharArray()){
            if (Character.isLetter(c)){
                sb.append(stack.pop());
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
