import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-25;   Time: 15:10
 */
public class 进制转换 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.next();
            int num = 0;
            for (int i = 2; i < str.length(); i++) {
                String tmp = str.charAt(i)+"";
                double n = Math.pow(16,str.length()-1-i);
                if (tmp.equals("A")) {
                    num += 10*n;
                }
                else if (tmp.equals("B") ) {
                    num += 11*n;
                }
                else if (tmp.equals("C")) {
                    num += 12*n;
                }
                else if (tmp.equals("D")) {
                    num += 13*n;
                }
                else if (tmp.equals("E")) {
                    num += 14*n;
                }
                else if (tmp.equals("F")) {
                    num += 15*n;
                }else if (Integer.parseInt(tmp)<10 && Integer.parseInt(tmp) >= 0){
                    num += Integer.parseInt(tmp)*n;
                }
            }
            System.out.println(num);
        }
    }
}
