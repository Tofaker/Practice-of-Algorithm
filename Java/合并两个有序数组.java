/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-21;   Time: 23:17
 */

//核心：   while ((p1 >= 0) && (p2 >= 0)){
//            nums1[p--] = (nums1[p1] < nums2[p2] ? nums2[p2--] : nums1[p1--]);
//        }





public class 合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = n + m - 1;
        while ((p1 >= 0) && (p2 >= 0)){
            nums1[p--] = (nums1[p1] < nums2[p2] ? nums2[p2--] : nums1[p1--]);
        }
        System.arraycopy(nums2,0,nums1,0,p2+1);
    }
}
