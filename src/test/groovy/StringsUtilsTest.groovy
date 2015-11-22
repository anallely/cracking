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

  def "isAnagram works as expected"() {
    given:
      StringsUtils stringsUtils = new StringsUtils()
      boolean isAnagram = stringsUtils.isAnagram(s1, s2)
    expect:
      isAnagram == expected
    where:
      s1                   | s2                   | expected
      "anita lava la tina" | "lava la tina anita" | true
      "toga"               | "gatos"              | false
  }

  def "isAnagram2 works as expected"() {
    given:
      StringsUtils stringsUtils = new StringsUtils()
      boolean isAnagram = stringsUtils.isAnagram2(s1, s2)
    expect:
      isAnagram == expected
    where:
      s1                   | s2                   | expected
      "anita lava la tina" | "lava la tina anita" | true
      "toga"               | "gatos"              | false
  }

  def "replace spaces with %20"() {
    given:
      StringsUtils stringsUtils = new StringsUtils()
      String result = stringsUtils.replaceSpaces(s)
    expect:
      result == expected
    where:
      s             | expected
      " "           | "%20"
      " ana llely " | "%20ana%20llely%20"
  }

}



