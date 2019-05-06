package strings;

/**
 * Write a function that reverses characters in (possibly nested) parentheses in the input string.
 *
 * Input strings will always be well-formed with matching ()s.
 *
 * For inputString = "(bar)", the output should be
 * reverseInParentheses(inputString) = "rab";
 *
 * For inputString = "foo(bar(baz))blim", the output should be
 * reverseInParentheses(inputString) = "foobazrabblim".
 * Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
 */
public class ReverseInParentheses {


  static String doReverseInParentheses(String input) {
    String[] chunks = splitInChunks(input);

    if (chunks.length == 1 ) {
      return isInParenthesis(input) ? reverse(doReverseInParentheses(removeParenthesis(input))) : input;
    }

    StringBuilder output = new StringBuilder();
    for (String chunk : chunks) {
      output.append(isInParenthesis(chunk) ? doReverseInParentheses(chunk) : chunk);
    }

    return output.toString();
  }

  private static String removeParenthesis(String input) {
    return input.substring(1, input.length() - 1);
  }

  private static String reverse(String input) {
    return new StringBuilder(input).reverse().toString();
  }

  private static boolean isInParenthesis(String input) {
    return (input.startsWith("*") && input.endsWith("*") );
  }

  private static String[] splitInChunks(String input) {

    if (isInParenthesis(input)) {
      return new String[] {input};
    }

    int nOpen = 0;
    char[] chars = input.toCharArray();


    for(int i = 0; i <input.length(); i++) {
      if(chars[i] == '(' && ++nOpen == 1) {
        chars[i] = '[';
      }
      else if(chars[i] == ')' && --nOpen == 0 ) {
        chars[i] = ']';
      }
    }
    System.out.println("--" + new String(chars));

    String[] split = new String(chars).replace("[", "-*").replace("]", "*-").split("-");
    System.out.println("SPLIT " + split.length + "" + split);
    return split;
  }
}