package array;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AddBorderTest {

  private String [] input;
  private String [] expected;


  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    String[] picture1 = {
      "abcde",
      "fghij",
      "klmno",
      "pqrst",
      "uvwxy"};

    String[] expected1 = {
      "*******",
      "*abcde*",
      "*fghij*",
      "*klmno*",
      "*pqrst*",
      "*uvwxy*",
      "*******"
    };

    String[] picture2 = {"wzy**"};

    String[] expected2 = {
      "*******",
      "*wzy***",
      "*******"
    };


    return Arrays.asList(
      new Object[][] {
        {picture1, expected1},
        {picture2, expected2},
      }
    );
  }


  public AddBorderTest(String[] input, String[] expected) {
    this.input = input;
    this.expected = expected;
  }

  @Test
  public void doAddBorder() {
    String[] result = AddBorder.addBorder(input);
    assertEquals(expected, result);
  }

}
