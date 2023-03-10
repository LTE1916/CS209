package tutorial.lab2;
import java.util.*;

public class EquivalenceExample {
    public static void main(String[] args) {
        Employee e3 = new Employee(2L, "Mary");
        Employee e1 = new Employee(1L, "zohn");
        Employee e2 = new Employee(1L, "John");
        

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        
  //    employeeList.sort(Comparator.comparing(Employee::getName));
      Collections.sort(employeeList,(employee1,employee2)->Long.compare(employee1.getId(),employee2.getId()));
        
        Map<Employee, Integer> map = new HashMap<>();
        Integer count;
        for(Employee e : employeeList){
            if ((count = map.get(e)) == null) {
                map.put(e, 1);
            } else {
                map.put(e, 1 + count);
            }
        }

        System.out.println(map);

//        e3.setId(3L);
//        map.put(new Employee(3L, "Mary"), 3);
//        System.out.println(map);

    }
}
