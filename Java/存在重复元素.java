import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-22;   Time: 17:58
 */
public class 存在重复元素 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length-1; i++) {
            if (!hashSet.contains(nums[i])){
                hashSet.add(nums[i]);
            }else {
                return true;
            }
        }
        return false;
    }
}
