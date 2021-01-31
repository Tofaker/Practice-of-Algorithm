import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-31;   Time: 13:52
 */
//BFS算法

public class 员工的重要性 {
    public static  int DFS(Map<Integer,Employee> info, int id){
        //累加当前员工和其下属的值
        int curImp = info.get(id).importance;
        for(int subId : info.get(id).subordinates){
            curImp += DFS(info,subId);
        }
        return curImp;
    }
    public static int getImportance(List<Employee> employees, int id) {
        Map<Integer,Employee> emps = new HashMap<>();
        for(Employee emp:employees){
            emps.put(emp.id,emp);
        }
        return DFS(emps,id);
    }

    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        //emps.add(new Employee([1, 5, [2, 3])
        getImportance(emps,1);
    }
}
