import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-02;   Time: 22:16
 */
public class 骆驼命名法 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

            String str = scanner.nextLine();
            System.out.println(fun1(str));
        }
    }

    private static String fun1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '_'){
                i++;
                sb.append(((char) (str.charAt(i)-32)));

            }else {
                sb.append(str.charAt(i));
            }
        }
        return str.toString();
    }

}
