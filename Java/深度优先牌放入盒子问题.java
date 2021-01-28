/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-28;   Time: 23:37
 */

/*  DFS：
        1.处理边界
        2.处理当前的一种可能
        3.确定一种可能后，  处理下一步(DFS)

* */


public class 深度优先牌放入盒子问题 {
    public static void main(String[] args) {
        int n = 3;
        int box[] = new int[n+1];//只用数组的 1 2 3 索引
        int used[] = new int[n+1];
        DFS(box,used,1);
    }
    public static void DFS(int[] box,int[] used,int idx){
        //保存当前的方案：边界： 最后一个盒子走完后
        if (idx == box.length){
            for (int i = 1; i < box.length; i++) {
                System.out.print(box[i]+" ");
            }
            System.out.println();
            return ;
        }

        //处理当前盒子逻辑
        for (int i = 1; i < box.length; ++i) {//盒子的个数和牌的个数一样
            if (used[i] == 0){//判断牌是否使用过
                //没有使用过
                box[idx] = i;//当前没有使用的牌放入当前盒子
                used[i] = 1;//标记使用了当前牌
                DFS(box,used,idx+1);//处理下一个盒子  idx+1
                used[i] = 0;//回溯标记  回收当前使用的牌
            }
        }
    }
}
