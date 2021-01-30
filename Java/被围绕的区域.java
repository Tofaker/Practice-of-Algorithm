/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-30;   Time: 17:52
 */
//https://leetcode-cn.com/problems/surrounded-regions/
public class 被围绕的区域 {
    /*
    思路 ：
    找出所有的圆圈，
    与边上所有点相连的点做一个渲染(标记矩阵进行标记)
    遍历所有的圆圈，没做标记的改为x
    */
    public void solve(char[][] board) {

        int row = board.length;
        if (row == 0 )return;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            if (board[i][0] == 'O'){ //第一列 和最后一列
                DFS(board,row,col,i,0);
            }
            if (board[i][col-1] == 'O'){
                DFS(board,row,col,i,col-1);
            }
        }
        for (int i = 1; i < col-1 ; i++) {
            if (board[0][i] == 'O'){  //第一行和最后一行
                DFS(board,row,col,0,i);
            }
            if (board[row-1][i] == 'O'){
                DFS(board,row,col,row-1,i);
            }
        }
        //替换和恢复
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O'){
                    board[i][j] = 'X';
                }else if (board[i][j] == 'a'){
                    board[i][j] = 'O';
                }
            }
        }
    }
    static int nex[][]={{-1,0},{1,0},{0,-1},{0,1}};//方向数组
    public static void DFS(char[][] board,int row ,int col,int x, int y ){
        //标记x.y位置
        board[x][y] = 'a';
        //x.y位置进行上下左右搜索
        for (int i = 0; i < 4; i++) {
            int nextx =x + nex[i][0];
            int nexty = y + nex[i][1];

            //判断
            if (nextx < 0 || nextx >= row || nexty < 0 || nexty >= col){
                continue;//不做标记处理
            }
            if (board[nextx][nexty] == 'O'){//属于圆圈
                DFS(board,row,col,nextx,nexty);
            }
        }
    }

}











