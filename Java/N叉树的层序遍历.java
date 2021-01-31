import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-31;   Time: 15:49
 */
public class N叉树的层序遍历 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();//队列
        if (root != null) {
            queue.offer(root);
        }

        List<List<Integer>> mat = new ArrayList<>();//数组
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i < size; i++) {//当前元素个数次循环
                Node cur = queue.poll();
                row.add(cur.val);
                for (Node child : cur.children){//孩子入队
                    queue.offer(child);
                }
            }
            if (row.isEmpty()) continue;
            if (!row.isEmpty()){
                mat.add(row);
            }

        }
        return mat;
    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};