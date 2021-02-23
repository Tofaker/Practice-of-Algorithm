import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-23;   Time: 8:15
 */
public class 返回第三大的数 {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(thirdMax(arr));
    }
    public static int thirdMax(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                long tmp = (long)(o1) - (long)o2 ;
                if (tmp > 0){
                    return 1;
                }else if (tmp == 0){
                    return 0;
                }else {
                    return -1;
                }
            }
        });
        for (int i = 0; i < nums.length; i++) {
            if (maxHeap.size() < 3 && !maxHeap.contains(nums[i])){
                maxHeap.offer(nums[i]);
            }else if (maxHeap.size() == 3 && nums[i] > maxHeap.peek() && !maxHeap.contains(nums[i])){
                maxHeap.poll();
                maxHeap.offer(nums[i]);
            }

        }
        if(maxHeap.size() == 1){
            return maxHeap.poll();
        }else if (maxHeap.size() == 2){
            maxHeap.poll();
            return maxHeap.poll();
        }
        return maxHeap.poll();
    }
}




















