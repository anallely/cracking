package array;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 *
 * Sample Input:
 *
 * 1 2 3 4 5
 *
 * Sample Output
 *
 * 10 14
 *
 * The minimum sum and the maximum sum of  4 of 5 elements.
 *
 */
public class MiniMaxSum {

  static void miniMaxSum(int[] arr) {
    long[] ints = miniMaxSumAux(arr);
    System.out.println((ints[0]) + " " + (ints[1]));
  }

  static long[] miniMaxSumAux(int[] arr) {

    // 1) Do next in one traverse
    // min = find minimum
    // max = find maximum
    // sum = calculate sum

    // 2) Then
    // minSum = sum - max
    // maxSum = sum - min

    long[] result = {0, 0};

    int min = Integer.MAX_VALUE;
    int max = 0;
    long sum = 0;

    for (int element : arr) {
      if (element < min) {
        min = element;
      }
      if (element > max) {
        max = element;
      }
      sum = sum + element;
    }

    result[0] = sum - max;
    result[1] = sum - min;
    return result;
  }
}
