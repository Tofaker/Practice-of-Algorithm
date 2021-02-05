import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-05;   Time: 15:11
 */
public class 单调栈结构 {
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
        for (int i = 0; i < arr.length; i++) {
            int[] arr1 = new int[2];
            for (int j = i; j >= 0; j--) {
                arr1[0] = Math.min(arr[i],arr[j]);
                if (arr1[0] < arr[i]){
                    arr1[0] = j;
                    break;
                }
                if (arr1[0] == arr[i] && j == 0){
                    arr1[0] = -1;
                }
            }

            for (int j = i; j < arr.length; j++) {
                arr1[1] = Math.min(arr[i],arr[j]);
                if (arr1[1] < arr[i]){
                    arr1[1] = j;
                    break;
                }
                if (arr1[1] == arr[i] && j == arr.length-1){
                    arr1[1] = -1;
                }
            }

            System.out.println(arr1[0] + " " + arr1[1]);
        }
    }
}










