import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-05;   Time: 14:46
 */
public class 数组中值出现了一次的数字 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int length = scanner.nextInt();
            int[] arr = new int[length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            func(arr);
        }
    }

    private static void func(int[] arr) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashmap.containsKey(arr[i])){
                hashmap.put(arr[i],hashmap.get(arr[i])+1);
            }else {
                hashmap.put(arr[i],1);
            }
        }
        int[] arr1 = new int[2];
        int i = 0;
        for (Integer tmp:hashmap.keySet()) {
            if (hashmap.get(tmp) % 2 == 1){
                arr1[i] = tmp;
                i++;
            }
        }
        System.out.print(Math.min(arr1[0],arr1[1]) + " ");
        System.out.print(Math.max(arr1[0],arr1[1]) + " ");
    }
}
