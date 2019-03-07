package strings;

/**
 * There are three types of edits that can be performed on strings: insert a character, remove a
 * character, or replace a character. Given two strings, write a function to check if they are one
 * edit (or zero edits) away. EXAMPLE pale, ple -> true pales, pale -> true pale, bale -> true pale,
 * bake -> false
 */
public class OneAway {

  static public boolean isOneAway(String a, String b) {
    int lenA = a.length();
    int lenB = b.length();

    boolean sameLength = lenA == lenB;

    if (sameLength) { // Replace character
      return hasOneDifferentCharacter(a, b);
    }

    if (lenA == lenB + 1) {
      return hasOneExtraCharacter(a, b);
    }

    if (lenA == lenB - 1) {
      return hasOneExtraCharacter(b, a);
    }

    return false;
  }

  private static boolean hasOneDifferentCharacter(String a, String b) {
    int countDiffs = 0;

    for (int i = 0; i < a.length(); i++) {

      if (a.charAt(i) != b.charAt(i)) {
        countDiffs++;

        if (countDiffs > 1) {
          return false;
        }
      }
    }

    return true;
  }

  private static boolean hasOneExtraCharacter(String a, String base) {
    int countExtraChars = 0;

    for (int i = 0, j = 0; i < a.length(); i++, j++) {

      if (j < base.length() && a.charAt(i) != base
        .charAt(j)) { //It should be the extra character, lets skip it
        countExtraChars++;
        i++;

        if (countExtraChars > 1) {
          return false;
        }
      }

    }

    return true;
  }

}
