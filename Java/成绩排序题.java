import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-02-10;   Time: 11:12
 */
public class 成绩排序题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int option = scanner.nextInt();
            List<student> studentList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                studentList.add(new student(scanner.next(),scanner.nextInt()));
            }
            if (option == 0){//0排序的方法  降序
                studentList.sort((o1,o2) -> o2.score - o1.score);
            }
            if (option == 1 ){//升序   默认是升序
                studentList.sort((o1,o2) -> o1.score - o2.score);
            }
            for (student stu: studentList) {//遍历输出
                System.out.println(stu.name + " " + stu.score);
            }
        }
    }
}
class student{
    String name;
    Integer score;

    public student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }
}
