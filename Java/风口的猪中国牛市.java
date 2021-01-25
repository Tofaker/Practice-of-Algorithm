import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-24;   Time: 14:08
 */
public class 风口的猪中国牛市 {
    /**
     * 计算你能获得的最大收益
     *
     * @param prices Prices[i]即第i天的股价
     * @return 整型
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            System.out.println(str);
            String[] s1 = str.split(",",0);
            int[] arr = new int[s1.length];
            for (int i = 0; i < s1.length; i++) {
                arr[i] = Integer.parseInt(s1[i]);
            }
            System.out.println(calculateMax(arr));
        }
    }
    public static int calculateMax(int[] prices) {
        return -1;
    }
}
