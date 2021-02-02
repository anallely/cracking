package array;

import java.util.Arrays;
import java.util.List;

/**
 * A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. Given an integer, , rotate the array that many steps left and return the result.
 *
 *
 * parameters:
 *
 * int d: the amount to rotate by
 * int arr[n]: the array to rotate
 *
 * returns:
 *
 * int[n]: the rotated array
 *
 * constraints:
 * 1 <= n <= 10^5
 * 1 <= d <= n
 *
 * sample input:
 * 5 4
 * 1 2 3 4 5
 *
 * sample output
 * 5 1 2 3 4
 */

public class LeftRotation {


  public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    int n = arr.size();
    Integer[] result = new Integer[n];


    for( int i = 0;  i < n; i++ ) {
      int resultIndex = (n + i - d) % n;
      result[resultIndex] = arr.get(i);
    }

    return Arrays.asList(result);
  }
}
