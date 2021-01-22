import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-19;   Time: 10:21
 */
public class 在霍格沃茨找零钱 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String needPayStr = scanner.next();
            String actualPayStr = scanner.next();
            //System.out.println(needPayStr+"=="+actualPayStr);
            String[] needStrArr = needPayStr.split("[.]");
            String[] actualStrArr = actualPayStr.split("[.]");
            int needPay = Integer.parseInt(needStrArr[0])*17*29
                    +Integer.parseInt(needStrArr[1])*29
                    +Integer.parseInt(needStrArr[2]);
            int actualPay = Integer.parseInt(actualStrArr[0])*17*29
                    +Integer.parseInt(actualStrArr[1])*29
                    +Integer.parseInt(actualStrArr[2]);
            int surplus = actualPay - needPay;
            if (surplus < 0){
                System.out.println("-");
                surplus = 0 - surplus;
            }
            int knut = surplus % 29;
            int sickle = (surplus / 29) % 17;
            int galleon = (surplus / 29) / 17;
            System.out.println(galleon+"."+sickle+"."+knut);

        }
    }
}
