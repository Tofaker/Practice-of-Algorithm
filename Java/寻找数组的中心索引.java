import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-22;   Time: 21:56
 */
public class 寻找数组的中心索引 {
    public static void main(String[] args) {
        boolean re = false;
        if (re){

        }
        int[] nums = {-1,-1,1,1,0,0};
        pivotIndex(nums);
    }
    public static int pivotIndex1(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2*sum + nums[i] == total){
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum - nums[0] == 0){
            return 0;
        }
        if (sum - nums[nums.length-1] == 0){
            return nums.length-1;
        }
        int tmp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (tmp*2 + nums[i] == sum){
                return i;
            }else {
                tmp += nums[i];
            }
        }
        return -1;
    }
}












