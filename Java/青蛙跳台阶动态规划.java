/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-24;   Time: 15:02
 */
/*
* 青蛙一次跳一级台阶，也可以跳两级..... 它也可以跳n级。求青蛙跳上一个n级的台阶总共有多少种跳法？
* 问题：跳上n级台阶总共有多少种跳法
* 状态F(i):跳上i级台阶的方法个数
* */
public class 青蛙跳台阶动态规划 {
    public static void main(String[] args) {
        int[] arr ={6,-3,-2,7,-15,1,2,2};
        /*int tmp = arr[0];
        int tmp2 = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if (tmp < tmp2){
                tmp = tmp2;
            }
            tmp2 += arr[i];
        }
        System.out.println(tmp);*/
        int tmp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Math.max(arr[i-1]+arr[i],arr[i]);
            tmp = Math.max(tmp,arr[i]);
        }
        System.out.println(tmp);
    }
}
