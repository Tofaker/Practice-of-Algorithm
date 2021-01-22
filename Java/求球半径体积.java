import java.util.Scanner;

import static java.lang.StrictMath.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-22;   Time: 23:18
 */
public class 求球半径体积 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int[] arr = new int[6];
            for (int i = 0; i < 6; i++) {
                arr[i] = scanner.nextInt();
            }
            func1(arr);
        }
    }

    private static void func1(int[] arr) {
        double tmp = (pow(arr[3] - arr[0], 2) + pow(arr[4] - arr[1], 2) + pow(arr[5] - arr[2], 2));
        double r = pow(tmp, 0.5);
        double pai = acos(-1);
        System.out.print(String.format("%.3f", r) + " ");
        System.out.println(String.format("%.3f", pai * 4 * pow(r, 3) / 3));
    }
}
