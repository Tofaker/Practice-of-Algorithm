/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-30;   Time: 22:06
 */
//      思路：     深度遍历记次数， 遍历时并修改矩阵为0:下次就不再遍历

public class 岛屿数量 {
    public static void main(String[] args) {
        char[][] grid = {{},{}};

    }
    public static int numIslands(char[][] grid){
        int sum = 0;
        int row = grid.length;int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1'){
                    DFS(grid,row,col,i,j);
                    sum++;
                }
            }
        }
        return sum;
    }
    static int nex[][]={{-1,0},{1,0},{0,-1},{0,1}};//方向数组
    public static void DFS(char[][] board,int row ,int col,int x, int y ){
        //标记x.y位置
        board[x][y] = '0';
        //x.y位置进行上下左右搜索
        for (int i = 0; i < 4; i++) {
            int nextx =x + nex[i][0];
            int nexty = y + nex[i][1];

            //判断
            if (nextx < 0 || nextx >= row || nexty < 0 || nexty >= col){
                continue;//不做标记处理
            }
            if (board[nextx][nexty] == '1'){//
                DFS(board,row,col,nextx,nexty);
            }
        }
    }
}
