import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-20;   Time: 20:50
 */
public class nex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            System.out.println(func1(n));
        }
    }

    private static int func1(int n) {
        if (n<=2){
            return 1;
        }
        return func1(n-1)+func1(n-2);
    }
}
