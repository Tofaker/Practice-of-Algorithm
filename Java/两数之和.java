import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-23;   Time: 11:43
 */
public class 两数之和 {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> hashSet = new HashSet<>();
        int[] arr = new int[2];
        for (int tmp:nums) {
            hashSet.add(tmp);
        }
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(target-nums[i])){
                arr[0] = i;
                for (int j = 0; j < nums.length; j++) {
                    if (target-nums[i] == nums[j]){
                        arr[1] = j;
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
