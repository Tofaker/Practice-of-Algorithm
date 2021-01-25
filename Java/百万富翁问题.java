/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-24;   Time: 13:33
 */

public class 百万富翁问题 {
    public static void main(String[] args) {
        double n = 0;
        for (int i=0; i < 30; i++) {
            n += Math.pow(2,i);
        }
        n = n/1000000;
        System.out.println(10*30*1000000);
        System.out.println(n);
    }
}
