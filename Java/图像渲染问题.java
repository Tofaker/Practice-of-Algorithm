/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-30;   Time: 16:35
 */


public class 图像渲染问题 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int row = image.length;
        int col = image[0].length;
        int[][] visited = new int[row][col];// 标记矩阵，初始化为0；
        int oldC = image[sr][sc];
        DFS(image,row,col,sr,sc,visited,oldC,newColor);
        return image;
    }
    int nex[][]={{-1,0},{1,0},{0,-1},{0,1}};//方向数组
    public void DFS(int[][] image, int row, int col, int newx, int newy, int[][] visited, int oldC, int newC){
        //visited用来标记是否染色，

        //1.染色
        image[newx][newy] = newC;
        visited[newx][newy] = 1;// 标记矩阵已经染过色
        //2.搜索：上下左右
        for (int i = 0; i < 4; i++) {//四次for循环，使用了方向矩阵，
            //利用方向数组，分别向上下左右走一个格子
            int nextx =newx + nex[i][0];
            int nexty = newy + nex[i][1];
            //判断位置有效性
            if (nextx <0 || nextx >= row || nexty < 0 || nexty >= col){//边界问题处理
                continue;//不处理
            }
            //颜色符合要求(必须是待染的颜色)，且没有搜索过
            if (image[nextx][nexty] == oldC && visited[nextx][nexty] == 0){//判断标记0：没染过，11：染过：   染过就直接跳过节省计算
                DFS(image,row,col,nextx,nexty,visited,oldC,newC);
            }
        }
    }

}
