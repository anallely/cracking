package misc;

import java.util.HashMap;
import java.util.Map;

public class InsertAndSum {

  private Map<String, Integer > words = new HashMap<>();

  public void insert(String word, int value) {
    words.put(word, value);
  }

  public int sum(String input) {

    int result;

    result = words.entrySet().stream().filter( entry -> entry.getKey().contains(input))
        .map( entry -> entry.getValue())
        .reduce( 0, (a,b) -> a + b );

    return result;
  }
}
