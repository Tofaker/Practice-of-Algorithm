import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-30;   Time: 15:29
 */

// Definition for Employee.



class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}


//主代码       //DFS算法
public class 员工的重要度 {

    public static void getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> emps = new HashMap<>();
        for (Employee emp : employees) {
            emps.put(emp.id, emp);
        }
        Queue<Employee> queue = new LinkedList<>();
        queue.offer(emps.get(id));
        int sum  = 0;
        while (!queue.isEmpty()){
            Employee cur = queue.poll();
            sum += cur.importance;//加入当前员工重要度
            for (int n: cur.subordinates) {//拿到下属数组的id在map中找到对应工号，加入到队列中
                Employee emp = emps.get(n);
                queue.offer(emp);
            }
            for (int i = 0; i < cur.subordinates.size(); i++) {
                queue.offer(emps.get(cur.subordinates.get(i)));//拿到下属数组的id在map中找到对应工号，加入到队列中
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        //emps.add(new Employee([1, 5, [2, 3])
        getImportance(emps,1);
    }
}
