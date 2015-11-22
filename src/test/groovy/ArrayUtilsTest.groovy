import spock.lang.IgnoreRest
import spock.lang.Specification

/**
 * Created by tsunllly on 11/21/15.
 */
class ArrayUtilsTest extends Specification {


  def "replace 90"() {
    given:
      ArrayUtils arrayUtils = new ArrayUtils()

      Integer[][] original =
      [
        [0, 1, 2, 3],
        [4, 5, 6, 7],
        [8, 9, 10, 11],
        [12, 13, 14, 15],
      ]

      Integer[][] rotated = arrayUtils.rotate90(original)

    expect:
      rotated ==  [
        [3, 7, 11, 15],
        [2, 6, 10, 14],
        [1, 5, 9, 13],
        [0, 4, 8, 12],
      ]
  }

  def "replace inplace 90"() {
    given:
      ArrayUtils arrayUtils = new ArrayUtils()

      Integer[][] original =
        [
          [0, 1, 2, 3],
          [4, 5, 6, 7],
          [8, 9, 10, 11],
          [12, 13, 14, 15],
        ]

      Integer[][] rotated = arrayUtils.rotateInplace90(original)

    expect:
      rotated ==  [
        [3, 7, 11, 15],
        [2, 6, 10, 14],
        [1, 5, 9, 13],
        [0, 4, 8, 12],
      ]
  }
}
