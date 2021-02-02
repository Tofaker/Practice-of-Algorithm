import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-02;   Time: 19:33
 */
public class 电话号码 {
    public static void main2(String[] args) {
        System.out.println(Integer.parseInt("3"));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();
        while (scanner.hasNext()){
            String str = scanner.next();
            String str1 = func(str);//处理字符串
            if (str1 == null || str1.length() < 8){
                continue;
            }else {
                if (hashSet.contains(str1)){
                    continue;
                }else {
                    //System.out.println(str1);
                    hashSet.add(str1);
                }

            }
            Iterator iterator = hashSet.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

        }
    }
    private static String func(String str) {
        StringBuilder sb = new StringBuilder();
        str = str.toUpperCase();
        if (str.length() < 7) return null;
        for (int i = 0; i < str.length() && (sb.length() < 8); i++) {//遍历字符串且sb小于8
            if (sb.length() == 3){ //拼接前面的
                sb.append('-');
            }
            if (str.charAt(i) == '-'){//处理-
                continue;
            }
            char tmp = str.charAt(i);
            if (tmp >= 'A' && tmp <= 'Z'){//处理正确逻辑:字母转数字
                if (tmp == 'S' ){   //三组特殊处理和 一个常规处理
                    sb.append("7");
                }else if (tmp == 'V') {
                    sb.append("8");
                }else if (tmp == 'Y' || tmp == 'Z'){
                    sb.append("9");
                }else {
                    sb.append(((tmp - 65) / 3 + 2));
                }
            }else if (Integer.parseInt(tmp+"") >= 0 ||Integer.parseInt(tmp+"")<10  ){
                sb.append(str.charAt(i));
            }else {
                continue;
            }
        }
        if (sb.length() < 8){
            return null;
        }
        return sb.toString();
    }
}












