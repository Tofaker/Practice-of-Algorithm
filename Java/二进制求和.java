/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-23;   Time: 11:48
 */
public class 二进制求和 {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));

    }
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        boolean carry = false;
        for (int i = a.length() - 1, j = b.length()-1; i >= 0 || j >= 0; i--,j--) {
            int former = i >= 0 ? a.charAt(i) - '0' : 0;
            int latter = j >= 0 ? b.charAt(j) - '0' : 0;
            int total = former + latter;
            if (carry) total++;
            sb.insert(0,total % 2 );
            carry = total >= 2 ? true : false;
        }
        if (carry) sb.insert(0,1);
        return sb.toString();

    }
}

