/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-20;   Time: 22:33
 */
public class 旋转数组 {
    public static void main(String[] args) {
        int[] nums =new int[]{1,2,3,4,5,6,7};
        int  k = 6;
        rotate(nums,k);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public static void reverse(int[] nums , int start , int end){
        while (start < end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start += 1;
            end -= 1;
        }
    }
}
