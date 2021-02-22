/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-22;   Time: 19:54
 */
public class 有序数组的平方 {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int m = arr.length-1;
        int n = 0 ;
        int q = nums.length-1;
        while (m >= 0){
            arr[m--] = (int) (Math.abs(nums[q]) > Math.abs(nums[n]) ? Math.pow(nums[q--],2) : Math.pow(nums[n++],2));
        }
        return arr;
    }
}
