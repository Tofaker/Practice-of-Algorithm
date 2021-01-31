import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-31;   Time: 17:32
 */
//BFS + 标记 +  多层循环

public class 单词接龙 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        //做个标记：  mark 避免重复搜索  标记已经搜索过的单词
        HashSet<String> mark = new HashSet<>();
        mark.add(beginWord);

        Set<String> dict = new HashSet<>();
        for (String word :wordList) {
            dict.add(word);
        }
        int count = 1;//做个计数器
        while (!queue.isEmpty()){
            //获取上一次转换之后的单词的个数
            int num = queue.size();
            for (int i = 0; i < num; i++) { //上一次存放的单词的个数，作为下一次的for的循环次数
                String curword = queue.poll();
                if (curword.equals(endWord)) return count;//循环内退出条件：找到了endword


                //修改一个位置的字符
                for (int j = 0; j < curword.length(); j++) {
                    StringBuilder sb = new StringBuilder(curword);
                    for (char ch ='a'; ch <= 'z'; ch++){
                        sb.setCharAt(j,ch);
                        String changeword = sb.toString();
                        //判断修改之后的单词是否在词典中，且没有搜索过
                        if (dict.contains(changeword) && !mark.contains(changeword)){
                            queue.offer(changeword);
                            mark.add(changeword);
                        }
                    }
                }
            }
            ++count;//转换成功一次
        }
        return 0;//转换不成功返回0
    }
}
