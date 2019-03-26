package array;

public class RotateMatrix90 {


  static int [][] rotate90(int [][]matrix) {


    int nSize = matrix.length;
    int[][] output = new int[nSize][nSize];

    for (int i = 0; i < nSize; i++) {
      for (int j = 0; j < nSize; j++) {
        output[j][nSize-1-i] = matrix[i][j];
      }
    }

    return output;
  }


}
