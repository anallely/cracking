import java.util.Arrays;

/**
 * Created by anallely.olivares on 11/29/2017.
 *
 You have a string s that consists of English letters, punctuation marks, whitespace characters, and brackets. It is guaranteed that the parentheses in s form a regular bracket sequence.

 Your task is to reverse the strings contained in each pair of matching parentheses, starting from the innermost pair. The results string should not contain any parentheses.

 Example

 For string s = "a(bc)de", the output should be
 reverseParentheses(s) = "acbde".

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string s

 A string consisting of English letters, punctuation marks, whitespace characters and brackets. It is guaranteed that parentheses form a regular bracket sequence.

 Constraints:
 5 ≤ s.length ≤ 55.
 */

public class ReverseParentheses {

    String reverseParentheses(String s) {

        int length = s.length();
        String[] aux = new String[length];
        aux[0] = "";
        int index = 0;

        for (int i = 0; i < length; i++) {


            char c = s.charAt(i);
            if( c == '(' ){
                index += 1;
                aux[index] = "";
            } else if( c == ')' ) {

            }
            else{
                aux[index] = aux[index] + c;
            }





        }





        return s;
    }

}
