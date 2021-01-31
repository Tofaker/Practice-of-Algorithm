/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-30;   Time: 23:26
 */

//思路：广度搜索，只返回有没有可能到达终点，溢满式遍历
public class 广度优先搜索 {

    //解决迷宫能否出去问题，深度解决迷宫出去多少条路问题

//    public static void main(String[] args) {
//
//    }
//    static final int nex[][]={{-1,0},{1,0},{0,-1},{0,1}};//方向数组
//    public static boolean BFS(int[][] grid, int sx ,int sy , int ex , int ey){
//        //sx  sy  起点 x，y    ex  ey  终点x，y
//
//        int[] visited = {};
//        int row = grid.length;
//        int col = grid[0].length;
//        Queue<int[]> queue = new LinkedList<>();
//        while(!queue.isEmpty()){
//            int[] cur = queue.poll();//获取队头元素
//            int first = sx; int second = cur[0][1];
//            if (first == ex && second ==ey){
//                return true;
//            }
////            for (int i = 0; i < 4; i++) {//搜索四个方向
////                int nextx = first + nex[i][0];
////                int nexty = second + nex[i][1];
////                if (nextx < 0 || nextx >= row || nexty < 0 || nexty >= col){
////                    continue;
////                }
////                //没有障碍且没有访问过的节点入队 ：为0是无障碍，为1 是有障碍，
////                //访问过改为1  (设置为障碍，免得下次继续访问)
////                if (grid[nextx][nexty] == 0 && visited[nextx][nexty] == 0){ //==0 是
////                    grid[sx][sy] = 1;
////                    queue.offer(int{{nextx,nexty},{}});
////                }
////            }
//
//        }
//        return false;//整个遍历走完都没有找到出口，所以返回false；
//    }
}










