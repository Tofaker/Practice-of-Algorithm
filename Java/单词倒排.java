import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-02;   Time: 22:34
 */
public class 单词倒排 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            String[] strs = str.split(" ");
            for (int i = strs.length-1 ; i >= 0 ; i--) {
                if (strs[i] == " "){
                    continue;
                }else {
                    System.out.print(strs[i]+" ");
                }
            }
        }
    }
}
