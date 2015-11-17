import spock.lang.IgnoreRest
import spock.lang.Specification

/**
 * Created by tsunllly on 11/11/15.
 */
class StringsUtilsTest extends Specification {

  def "uniqueCharacters works correctly"() {
    given:
      StringsUtils stringsUtils = new StringsUtils()
      boolean result = stringsUtils.uniqueCharacters(s)
    expect:
      result == expected
    where:
      s         | expected
      "abcdef"  | true
      "aabcdef" | false
  }

  def "reverse a C like String works"() {
    given:
      StringsUtils stringsUtils = new StringsUtils()
      String result = stringsUtils.reverseCString(s)
    expect:
      result == expected
    where:
      s          | expected
      "abcdef\0" | "fedcba\0"
      "abcde\0"  | "edcba\0"
      "ana\0"    | "ana\0"
      "x\0"      | "x\0"
      null       | null
  }

  @IgnoreRest
  def "delete duplicates works as expected"() {
    given:
      StringsUtils stringsUtils = new StringsUtils()
      String result = stringsUtils.removeDuplicatedChars(s)
    expect:
      result == expected
    where:
      s         | expected
      null      | null
      ""        | ""
      "abc"     | "abc"
      "aabbcc"  | ""
      "ababa"   | ""
      "aabxbcc" | "x"
  }

}



