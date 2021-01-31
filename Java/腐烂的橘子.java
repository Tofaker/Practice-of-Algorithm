import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-31;   Time: 16:06
 */

//BFS 算法解题


public class 腐烂的橘子 {
}
class pair{
    public int x ;
    public int y;

    public pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Solution {
    int[][] next = {{1,0},{-1,0},{0,1},{0,-1}};//方向矩阵

    public int orangesRotting(int[][] grid) {
        //用Entry存放位置
        Queue<pair> queue = new LinkedList<>();
        int row = grid.length;int col = grid[0].length;

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2){
                    queue.add(new pair(i,j));
                }
            }
        }
        if (queue.isEmpty()){
            return -1;
        }
        int minute = 0;//走的步数
        while (!queue.isEmpty()){//BFS算法  当前腐烂的橘子带出下一批腐烂的橘子
            int n = queue.size();
            int flag = 0;//用来标记是否是新的被腐烂的
            for (int i = 0; i < n; i++) {
                pair curpos = queue.poll();//拿出腐烂的橘子
                for (int j = 0; j < 4; j++) {//向四个方向蔓延
                    int nextx = curpos.x + next[j][0];
                    int nexty = curpos.y + next[j][1];
                    //判断是否是可以被腐烂、空格、越界
                    if (nextx >= row || nextx <0 || nexty >= col || nexty <0 || grid[nextx][nexty] != 1){
                        continue;//不做处理
                    }
                    grid[nextx][nexty] = 2;//腐烂
                    flag = 1;
                    queue.offer(new pair(nextx,nexty));
                }
            }
            if (flag == 1){//当是新的被腐烂时，minute 才 ++
                minute++;
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return minute;
    }
}







