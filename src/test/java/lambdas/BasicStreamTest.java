package lambdas;

import lambdas.resources.Employee;
import lambdas.resources.EmployeeDatabase;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class BasicStreamTest {

    private static Employee[] arrayOfEmps = {
        new Employee(1, "Jeff Bezos", 100000.0),
        new Employee(2, "Bill Gates", 200000.0),
        new Employee(3, "Mark Zuckerberg", 300000.0)
    };

    @Test
    public void forEachTest() {
        List<Employee> empList = Arrays.asList(arrayOfEmps);

        empList.stream().forEach(e -> e.salaryIncrement(10.0));

        assertThat(empList, contains(
            hasProperty("salary", equalTo(110000.0)),
            hasProperty("salary", equalTo(220000.0)),
            hasProperty("salary", equalTo(330000.0))
        ));
    }

    @Test
    public void mapTest() {
        Integer[] ids = {1, 2, 3};

        EmployeeDatabase database = new EmployeeDatabase();

        database.add(arrayOfEmps[0]);
        database.add(arrayOfEmps[1]);
        database.add(arrayOfEmps[2]);

        List<Employee> empList = Stream.of(ids)
            .map(database::findById)
            .collect(Collectors.toList());

        assertThat(empList, contains(
            hasProperty("id", equalTo(1)),
            hasProperty("id", equalTo(2)),
            hasProperty("id", equalTo(3))
        ));

        assertEquals(empList.size(), ids.length);
    }


    @Test
    public void filterTest() {

        List<Employee> empList = Arrays.asList(arrayOfEmps);
        List<Employee> employees  = empList.stream()
            .filter( e -> e.getSalary() >= 200000)
            .collect(Collectors.toList());

        assertThat(employees, contains(
            hasProperty("salary", equalTo(200000.0)),
            hasProperty("salary", equalTo(300000.0))
        ));
    }

    @Test
    public void findFirstTest() {
        List<Employee> empList = Arrays.asList(arrayOfEmps);
        Employee employee  = empList.stream()
            .filter( e -> e.getName().equals("Bill Gates"))
            .findFirst().orElse(null);

        assertEquals(2, employee.getId());
    }


    @Test
    public void toArrayTest() {
        List<Employee> empList = Arrays.asList(arrayOfEmps);
        Employee[] result = empList.stream().toArray( Employee[]::new );

        assertThat(result, equalTo(arrayOfEmps));

    }

    @Test
    public void toFlatMap() {
        Integer[][] ids = {{1}, {2}, {3}};

        EmployeeDatabase database = new EmployeeDatabase();
        database.add(arrayOfEmps[0]);
        database.add(arrayOfEmps[1]);
        database.add(arrayOfEmps[2]);

        List<Employee> empList = Stream.of(ids)
            .flatMap(inner ->  Stream.of(inner).map( database::findById) )
            .collect(Collectors.toList());

        assertThat(empList, contains(
                hasProperty("id", equalTo(1)),
                hasProperty("id", equalTo(2)),
                hasProperty("id", equalTo(3))
        ));

        assertEquals(empList.size(), ids.length);
    }
}
