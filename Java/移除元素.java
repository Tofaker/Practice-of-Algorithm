/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-20;   Time: 23:15
 */
public class 移除元素 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");
        }
    }
    public static int removeElement(int[] nums, int val) {
        int size = nums.length;//标记有效数字
        int last = nums.length-1;
        int first = 0;
        while (first <= last){
            if (nums[first] == val){
                size--;
                while (nums[last] == val && first < last){
                    last--;
                    size--;
                }
                nums[first] = nums[last];
                nums[last] = val;
                last--;

            }else {
                first++;
            }
        }
        return size;
    }
    public int removeElement1(int[] nums, int val) {//双指针法：一头一尾
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public int func(int[] nums,int val){//双指针法  两指针都从头开始
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}







