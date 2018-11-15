package fifolifo;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.hamcrest.Matchers.is;

import fifolifo.core.EmptyStackException;
import org.junit.Test;

public class ConstantTimeMinimumStackTest {

  @Test
  public void popAndPushAndMinTest() throws EmptyStackException {
    ConstantTimeMinimumStack stack = new ConstantTimeMinimumStack();

    stack.push(30);  // 30
    assertThat( stack.min(), is(30));

    stack.push(10);  // 30, 10
    assertThat( stack.min(), is(10));

    stack.push(20);  // 30, 10, 20
    assertThat( stack.min(), is(10));

    stack.push(9);  // 30, 10, 20, 9
    assertThat( stack.min(), is(9));

    assertThat( stack.pop(), is(9));  // 30, 10, 20
    assertThat( stack.min(), is(10));

    assertThat( stack.pop(), is(20));  // 30, 10
    assertThat( stack.min(), is(10));

    assertThat( stack.pop(), is(10));  // 30
    assertThat( stack.min(), is(30));

    assertThat( stack.pop(), is(30));  //

    try {
      stack.min();
      fail( "No more elements in stack, it should fail" );
    } catch (EmptyStackException emptyStackException) {
      assertEquals("The stack is empty", emptyStackException.getMessage());
    }

    try {
      stack.pop();
      fail( "No more elements in stack, it should fail" );
    } catch (EmptyStackException emptyStackException) {
      assertEquals("The stack is empty", emptyStackException.getMessage());
    }
  }

}
