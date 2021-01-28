/*
import java.util.Vector;

*/
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-27;   Time: 23:53
 *//*

public class 三角形最小路径和 {
    public static int main(String[] args) {
        Vector<Vector<Integer>> triangle = new Vector<>();
        if (triangle.isEmpty())return 0 ;
        int row = triangle.size();
        int col = triangle[0].size();
        //F(0,0) = a[0][0]
        Vector<Vector<int>> minSum(triangle);
        for (int i = 1; i < row; ++i) {
            for (int j = 0; j < i; ++j) {
                if (j == 0){
                    minSum[i][j] = minSum[i-1][j] + triangle[i][j];
                }else if (j == i){
                    minSum[i][j] = minSum[i-1][j-1] + triangle[i][j];
                }else {
                    minSum[i][j] = Math.min(minSum[i-1][j],minSum[i-1][j-1]) + triangle[i][j];
                }
            }
        }
        //选择一个全局最小
        int ret = minSum[row-1][0];
        for (int i = 1; i < row; ++i) {
            ret = Math.min(ret,minSum[row-1][i]);
        }
        return ret;
    }

    public static int main2(String[] args) {
        //思路二
        Vector<Vector<int>> minSum(triangle);
        for (int i = row-2; i >= 0; --i) {
            for (int j = 0; j <= i; ++j) {
                minSum[i][j] = Math.min(minSum[i+1][j],minSum[i+1][j+1] + triangle[i][j]);
            }
        }
        return minSum[0][0];
    }



}














*/
