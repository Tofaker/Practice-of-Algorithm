import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-21;   Time: 22:06
 */
public class 赎金信 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (!hashMap.containsKey(magazine.charAt(i))){
                hashMap.put(magazine.charAt(i),1);
            }else {
                hashMap.put(magazine.charAt(i),hashMap.get(magazine.charAt(i))+1);
            }

        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!hashMap.containsKey(ransomNote.charAt(i))){
                return false;
            }
            hashMap.put(ransomNote.charAt(i),hashMap.get(ransomNote.charAt(i))-1);
            if (hashMap.get(ransomNote.charAt(i)) < 0){
                return false;
            }
        }
        return true;
    }
}
