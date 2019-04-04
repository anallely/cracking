package array;

public class ZeroMatrix {


  static int [][] zeroMatrix(int [][]matrix) {
    int iSize = matrix.length;
    int jSize = matrix[0].length;

    for (int i = 0; i < iSize; i++) {
      for (int j = 0; j < jSize; j++) {
        if (matrix[i][j] == 0) {
          // Mark column with 0
          matrix[0][j] = 0;

          // Mark row with 0
          matrix[i][0] = 0;

          // We can avoid analyze rest of columns in that row (it is zero anyways)
          break;
        }
      }
    }

    // Fill 0' rows
    for(int i = 0; i < iSize; i++) {
      if( matrix[i][0] == 0) {
        for(int j = 0; j < jSize; j++) {
          matrix[i][j] = 0;
        }
      }
    }

    // Fill 0' columns
    for (int j = 0; j < jSize; j++) {
      if( matrix[0][j] == 0) {
        for (int i = 0; i < iSize; i++) {
          matrix[i][j] = 0;
        }
      }
    }

    return matrix;
  }

}
