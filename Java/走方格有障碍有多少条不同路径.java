/*
import java.util.Vector;

*/
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-28;   Time: 10:54
 *//*

public class 走方格有障碍有多少条不同路径 {
    public static int main(String[] args) {
        Vector<Vector<int>> obstacleGrid = new Vector<>();
        if (obstacleGrid.empty()) {//空矩阵
            return 0;
        }
        int row = obstacleGrid.size();
        int col = obstacleGrid[0].size();

        Vector<Vector<int>> pathNum(row,Vector<int>(col,0));

        for (int i = 0; i < row; i++) {//   初始化
            if (obstacleGrid[i][0] == 0){ //表示无障碍物
                pathNum[i][0] =1;       //设置为1 即路径可以走
            }else{
                break;// ==1 表示遇到障碍物，因为默认是0，所以不用改
            }
        }
        for (int i = 0; i < col; i++) {//   初始化
            if (obstacleGrid[0][i] == 0){
                pathNum[0][i] =1;
            }else{
                break;
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 0 ) //表示没有障碍
                    pathNum[i][j] = pathNum[i][j-1] + pathNum[i-1][j]; //没有障碍
            }
        }
        return pathNum[row-1][col-1];//返回到最后一个点的路径数
    }
}
*/
public class 走方格有障碍有多少条不同路径 {
    public static void main(String[] args) {
        for (int k = 0; k < 5; k++) {
            for (int i = 0; i <5 ; i++) {
                if (i == 2 ){
                    break;
                }
                System.out.println(i+"kk");
            }
            System.out.println(k);
        }


    }

}