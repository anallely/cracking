package hackerrank.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 6 x 6 contains 16 hourglasses
 *
 * 1 1 1
 *   1
 * 1 1 1
 *
 *Sample Input
 *
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 *
 * Sample Output
 * 19
 *
 * Explanation
 * 2 4 4
 *   2
 * 1 2 4
 *
 */
public class HourglassSum {


  // Complete the hourglassSum function below.
  public static int hourglassSum(int[][] arr) {
    int maxSum = 0;
    List<Integer> hourglassSums = new ArrayList<>();

    for (int i = 0; i < 16; i++) {
      hourglassSums.add(getHourGlassSum(i, arr));
    }

    return hourglassSums.stream()
      .mapToInt(v-> v)
      .max()
      .orElse(0);
  }

  private static Integer getHourGlassSum(int hourglassIndex, int[][] arr)  {
    int originI = hourglassIndex / 4;
    int originJ = hourglassIndex % 4;

    int sum = 0;

    for (int i = originI; i < originI + 3; i++) {
      for (int j = originJ; j <  originJ + 3; j++) {
        sum =  sum + arr[i][j];
      }
    }

    sum = sum - arr[originI+1][originJ] - arr[originI+1][originJ+2];

    return sum;
  }

}
