/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-21;   Time: 21:12
 */
public class 搜索插入位置 {
    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]){
            return 0;
        }
        if (target > nums[nums.length-1]){
            return nums.length;
        }
        for (int i = 0; i < nums.length;) {
            if (nums[i] < target){
                i++;
            }else if (nums[i] >= target ){
                return i;
            }
        }
        return nums.length-1;
    }
}
