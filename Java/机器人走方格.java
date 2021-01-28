/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-28;   Time: 9:43
 */
public class 机器人走方格 {
    public static void main(String[] args) {

    }
    public int uniquePaths(int m, int n){
        int[][] pathNum = new int[m][n];
        for (int i = 0; i < n; i++) {
            pathNum[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            pathNum[i][0] = 1;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pathNum[i][j] = pathNum[i][j-1] + pathNum[i-1][j];
            }
        }
        return pathNum[m-1][n-1];
    }
}
