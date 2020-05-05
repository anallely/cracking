package hackerrank;


/**
 Lilah has a string, s , of lowercase English letters that she repeated infinitely many times.

 Given an integer,n , find and print the number of letter a's in the first n letters of Lilah's infinite string.

 For example, if the string  s= 'abcac' and n=10, the substring we consider is abcacabcacab, the first 10  characters of her infinite string. There are  4 occurrences of a in the substring.

 Function Description

 Complete the repeatedString function in the editor below.
 It should return an integer representing the number of occurrences of a in the prefix of length n in the infinitely repeating string.

 repeatedString has the following parameter(s):

 s: a string to repeat
 n: the number of characters to consider

 Input Format

 The first line contains a single string, .
 The second line contains an integer, .

 Output Format

 Print a single integer denoting the number of letter a's in the first  letters of the infinite string created by repeating  infinitely many times.

 Sample Input 0
 aba
 10
 Sample Output 0
 7

 abaabaabaa // 7 a's


 Sample Input 1
 a
 1000000000000
 Sample Output 1
 1000000000000

 aaaaaaaa.....a //1000000000000a's

 */
public class RepeatedString {

  // Complete the repeatedString function below.
  public static long repeatedString(String s, long n) {

    long remainder = n %  s.length();
    long quotient =  (n - remainder) / s.length();

    // Analyze quotient
    long sCount = s.chars().filter(it -> it == 'a').count();

    // Analyse reminder
    long rCount = s.substring(0, (int) remainder).chars().filter(it -> it == 'a').count();

    return (sCount * quotient)+ rCount;
  }

}
