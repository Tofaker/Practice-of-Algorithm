/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-21;   Time: 22:26
 */
public class 判断回文数 {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        if (str.length() == 1){
            return true;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
