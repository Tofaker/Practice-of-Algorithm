import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-31;   Time: 11:44
 */
public class 连续最大和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(scanner.hasNextInt()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            func(arr);
        }

    }

    private static void func(int[] tmp) {
        if (tmp.length == 0) return;
        int max = tmp[0];
        int sum = tmp[0];
        for (int i = 0; i < tmp.length; i++) {
            sum = Math.max(sum + tmp[i],tmp[i]);
            max = Math.max(sum,max);

        }
        System.out.println(max);
    }
}
