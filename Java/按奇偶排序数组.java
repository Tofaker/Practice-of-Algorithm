/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-22;   Time: 21:19
 */
public class 按奇偶排序数组 {
    public int[] sortArrayByParity(int[] A) {//双指针法
        int f = 0;
        int e = A.length-1;
        while (f < e){
            if (A[f]%2 == 0) {
                f++;
            }else if (A[e] % 2 != 0){
                e--;
            }else if (A[f]%2 != 0 && A[e]%2 == 0){
                int tmp = A[f];
                A[f] = A[e];
                A[e] = tmp;
                f++;e--;
            }
        }
        return A;
    }
}
