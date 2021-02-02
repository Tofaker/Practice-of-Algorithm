import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-02;   Time: 21:04
 */
//基于DFS的动态规划
public class 求和 {
    static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();//保存结果集
    static ArrayList<Integer> list = new ArrayList<>();//保存每一行结果
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            dfs(1,m,n);
            //字典序排列输出
            for (ArrayList<Integer> l :res) {
                int i = 0;
                for (; i < l.size() - 1;i++){
                    System.out.print(l.get(i)+" ");
                }
                System.out.println(l.get(i));
            }
        }
    }
    //核心逻辑：求n个数中和为m的数的集合

    public static void dfs(int index,int count, int n){
        if (count == 0){
            res.add(new ArrayList<>(list));
        }else {
            for (int i = index; i <= count && i <= n ; i++) {
                list.add(i);
                dfs(i+1,count-i, n);
                list.remove(list.size()-1);
            }
        }
    }
}









