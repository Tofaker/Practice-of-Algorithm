import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-25;   Time: 15:55
 */
public class 木棒拼图 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            int n = Integer.parseInt(scanner.nextLine());
            int size = 0;//数组的有效长度
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                String tmp = scanner.nextLine();
                StringBuilder str = new StringBuilder();
                for (int j = 2; j <tmp.length() ; j++) {
                    str.append(tmp.charAt(j));
                }
                if (tmp.charAt(0) == '1'){//添加
                    arr[i] = Integer.parseInt(String.valueOf(str));
                    size++;
                }else if (tmp.charAt(0) == '2'){//找出并删除
                    for (int j = 0; j < i; j++) {
                        if ( arr[j] == Integer.parseInt(String.valueOf(str))){
                            arr[j] = 0;
                            size--;
                            break;
                        }
                    }
                }
                int sum = 0;
                int max = 0;

                for (int j = 0; j < arr.length; j++) {
                    sum += arr[j];
                    max =Math.max(max,arr[j]);
                }
                if (size > 2 && (sum-max) > max){
                    System.out.println("Yes");
                }else {
                    System.out.println("NO");
                }
            }
        }
    }
}











