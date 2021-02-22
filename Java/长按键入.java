/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-22;   Time: 18:03
 */
public class 长按键入 {
    public static void main(String[] args) {
        String str1 = "saeed";
        String str2 = "ssaaedd";
        System.out.println(isLongPressedName(str1, str2));

    }
    public static boolean isLongPressedName(String name, String typed) {
        int i = 0,j = 0;
        while (j < typed.length()){
            if (i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }else if (j > 0 && typed.charAt(j) == typed.charAt(j-1)){
                j++;
            }else {
                return false;
            }
        }
        return i == name.length();
    }


    public static boolean isLongPressedName1(String name, String typed) {
        int m = 0;int n = 0;
        while (n < typed.length()){
            if (m < name.length() && name.charAt(m) == typed.charAt(n)){
                m++;
                n++;
            }else if (n > 0 && typed.charAt(n) == typed.charAt(n-1)){
                n++;
            }else {
                return false;
            }
        }
        return m == name.length();
    }
}
