package lambdas;

import lambdas.resources.Employee;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.List;


public class BasicStreamTest {

    private static Employee[] arrayOfEmps = {
        new Employee(1, "Jeff Bezos", 100000.0),
        new Employee(2, "Bill Gates", 200000.0),
        new Employee(3, "Mark Zuckerberg", 300000.0)
    };


    @Test
    public void forEachTest() {
        List<Employee> empList = Arrays.asList(arrayOfEmps);
        empList.stream();

        empList.stream().forEach(e -> e.salaryIncrement(10.0));

        assertThat(empList, contains(
            hasProperty("salary", equalTo(110000.0)),
            hasProperty("salary", equalTo(220000.0)),
            hasProperty("salary", equalTo(330000.0))
        ));
    }
}
