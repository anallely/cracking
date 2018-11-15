import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import misc.InsertAndSum;
import org.junit.Test;

public class InsertAndSumTest {

    @Test
    public void naiveTest() {
        InsertAndSum insertAndSum = new InsertAndSum();
        assertEquals(0, insertAndSum.sum("app"));

        insertAndSum.insert("apple", 3);
        assertEquals(3, insertAndSum.sum("app"));

        insertAndSum.insert("app", 2);
        assertEquals(5, insertAndSum.sum("app"));
    }

}
