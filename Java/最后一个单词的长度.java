/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-21;   Time: 22:41
 */
public class 最后一个单词的长度 {
    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        for (int i = s1.length-1; i >= 0; i--) {
            if (s1[i].length() != 0){
                return s1[i].length();
            }
        }
        return 0;
    }
}
