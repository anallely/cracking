package strings;

/**
 * String Compression: Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
 * "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */
public class StringCompression {

  static public String doCompression(String input) {
    String output = "";

    int inputLen = input.length();

    int i = 0;
    int j = 0;

    while ( i < inputLen ) {

      if ( !stillSmaller(input, output, String.valueOf(j - i).length() ) ) {
        output = input;
        break;
      }

      while (input.charAt(j) == input.charAt(i) ) {
        j++;

        if (j >= inputLen) {
          break;
        }
      }

      output = output.concat(Character.toString(input.charAt(i)));
      output = output.concat(String.valueOf(j - i));

      i=j;
    }


    return output;
  }

  private static boolean stillSmaller(String input, String current, int sizeCount ) {
    int inputLen = input.length();
    return current.length() + 2 < inputLen;  //+2 (in th best case, remaining chars are all same, i.e c6)
  }


}
