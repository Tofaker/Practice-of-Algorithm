/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-20;   Time: 22:20
 */
public class 转换小写字母 {
    public static void main(String[] args) {
        System.out.println(toLowerCase("HEELOO"));
    }
    public static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90){
                sb.append((char)(str.charAt(i) +32));
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
