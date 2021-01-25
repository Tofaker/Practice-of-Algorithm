import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-25;   Time: 14:49
 */
public class 字母统计 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.next();
            func1(str);
        }
    }

    private static void func1(String str) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 65; i < 90; i++) {
            hashMap.put((char) i,0);
        }
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(str.charAt(i))){//属于a-z
                //存入hashmap
                hashMap.put(str.charAt(i),hashMap.get(str.charAt(i))+1);
            }
        }
        for (Map.Entry<Character,Integer> e:hashMap.entrySet()){
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }

}
