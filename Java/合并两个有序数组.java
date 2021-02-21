/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-21;   Time: 23:17
 */
public class 合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = 0; i < m; i++) {
            if (nums1[i] > nums2[j]){
                int tmp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = tmp;
            }
        }
    }
}
