package array;

public class RotateMatrix90 {


  static int [][] rotate90UsingMemory(int [][]matrix) {

    int nSize = matrix.length;
    int[][] output = new int[nSize][nSize];

    for (int i = 0; i < nSize; i++) {
      for (int j = 0; j < nSize; j++) {
        output[j][nSize-1-i] = matrix[i][j];
      }
    }

    return output;
  }

  static int [][] rotate90Inplace(int [][]matrix) {
    int nSize = matrix.length;

    int m, n, mp;

    for (int i = 0; i < nSize/2; i++) {
      for (int j = 0; j < nSize/2; j++) {
        int valueToCopy = matrix[i][j];

        m = i;
        n = j;

        do {
          mp = m;
          m = n;
          n = nSize - 1 - mp;
          valueToCopy = copyAndAssign(matrix, m, n, valueToCopy);
        } while ( i != n || j !=  nSize - 1 - m);

        matrix[i][j] = valueToCopy;
      }
    }

    return matrix;
  }

  static int  copyAndAssign(int [][]matrix, int i, int j, int newValue) {
    int originalValue = matrix[i][j];
    matrix[i][j] = newValue;
    return originalValue;
  }

}
