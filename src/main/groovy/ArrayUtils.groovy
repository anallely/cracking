/**
 * Created by tsunllly on 11/21/15.
 */
class ArrayUtils {

  Integer[][] rotate90(Integer[][] original) {
    int i, j
    int n = original.length
    Integer[][] rotated = new Integer[n][n]

    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        rotated[n - 1 - j][i] = original[i][j]
      }
    }
    rotated
  }

  Integer[][] rotateInplace90(Integer[][] original) {

    boolean right, down, left, up

    int i
    int j

    int offset = 0
    int limit = original.length - 1

    while (offset < limit) {

      int pivot = original[offset][limit]
      while (original[offset][offset] != pivot) {

        i = offset
        j = offset
        int first = original[i][j]

        left = true
        while (left && j < limit) {
          original[i][j] = original[i][j + 1]
          j++
        }

        up = true
        i = offset
        j = limit
        while (up && i < limit) {
          original[i][j] = original[i + 1][j]
          i++
        }

        right = true
        i = limit
        j = limit
        while (right && j > offset) {
          original[i][j] = original[i][j - 1]
          j--
        }

        down = true
        i = limit
        j = offset
        while (down && i > offset) {
          original[i][j] = original[i - 1][j]
          i--
        }

        original[offset + 1][offset] = first
      }
      offset++
      limit--
    }


    original
  }

}
