import java.util.HashSet;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-22;   Time: 22:59
 */
public class 坏键盘事件 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str1 = scanner.next();
            String str2 = scanner.next();
            func1(str1,str2);
        }
    }
    private static void func1(String str1, String str2) {
        HashSet hashSet = new HashSet();
        str1 = str1.trim().toUpperCase();
        str2 = str2.trim().toUpperCase();
        for (int i = 0; i < str1.length(); i++) {
            if (!(str2.contains(str1.charAt(i) + "") || hashSet.contains(str1.charAt(i)))){

                System.out.print(str1.charAt(i));
                hashSet.add(str1.charAt(i));
            }
        }
    }
}
