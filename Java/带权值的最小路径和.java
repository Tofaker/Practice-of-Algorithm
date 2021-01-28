/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-28;   Time: 11:07
 */
public class 带权值的最小路径和 {
    public static int main1(int[][] grid) {
        if (grid.length == 0){
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 1; i < row; i++) {//处理边界问题 ：第一列
            grid[i][0] = grid[i-1][0] +grid[i][0];
        }
        for (int i = 1; i < col; i++) { //处理边界问题：第一行
            grid[0][i] = grid[0][i-1] + grid[0][i];
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                grid[i][j] = Math.min(grid[i-1][j],grid[i][j-1]) + grid[i][j];
            }
        }
        return grid[row-1][col-1];
    }

    public static void main(String[] args) {
        for (int i = 1; i <5; i++) {
            System.out.println(i);
        }
    }
}
