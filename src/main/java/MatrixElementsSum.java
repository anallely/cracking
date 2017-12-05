/**
 * Created by anallely.olivares on 11/29/2017.
 */
public class MatrixElementsSum {


    int matrixElementsSum(int[][] matrix) {

        int result = 0;
        int nRow = matrix.length;
        int nColumn = matrix[0].length;

        boolean[] hauntedColumn = new boolean[nColumn];

        for( int row = 0; row < nRow; row++){
            for( int column = 0; column < nColumn; column++) {

                if(  matrix[row][column] == 0 ){
                    hauntedColumn[column] = true;
                }

                if( hauntedColumn[column] == false ) {
                    result = result + matrix[row][column];
                }
            }
        }
        return result;
    }
}
