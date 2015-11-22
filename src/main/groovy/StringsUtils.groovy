import java.lang.reflect.Array

/**
 * Created by tsunllly on 11/11/15.
 */
class StringsUtils {

  boolean uniqueCharacters(String str) {
    boolean[] aux = new boolean[50]
    boolean uniqueCharacters = true

    str.toCharArray().each {
      int index = (int) it - 97
      if (aux[index]) {
        uniqueCharacters = false
      }
      aux[index] = true
    }
    return uniqueCharacters
  }


  String reverseCString(String str){
    if(str == null) {
      return str
    }

    int n = 0
    while( str[n] != '\0' ){
      n++
    }

    char aux
    char[] result = new char[n+1]
    result[n] = '\0'
    for(int i = 0; i < n; i++){
      aux = str[i]
      result[i] = str[n-1]
      result[n-1] = aux
      n--
    }

    result.toString()
  }



  String removeDuplicatedChars(String str){
    if(str == null) {
      return str
    }

    Integer[] aux = new Integer[256]

    // Count chars on aux array
    str.toCharArray().each {
      int index = (int) it - 97
      aux[index] = (aux[index] ?: 0) + 1
    }

    // Calculate size of result: n
    int n = 0
    str.toCharArray().each {
      int index = (int) it - 97
      if( aux[index] == 1){
        n++
      }
    }

    // Create result from information above
    char[] result = new char[n]
    int i = 0
    str.toCharArray().each {
      int index = (int) it - 97
      if ( aux[index] && aux[index] == 1){
        result[i++] = it
      }
    }

    result.toString()
  }


  boolean isAnagram(String str1, String str2){
    char[] c1 = str1.toCharArray()
    char[] c2 = str2.toCharArray()
    Arrays.sort(c1)
    Arrays.sort(c2)
    c1 == c2
  }

  boolean isAnagram2(String str1, String str2){
    Integer[] aux1 = new Integer[256]
    Integer[] aux2 = new Integer[256]

    // Put 1's due to str1
    str1.toCharArray().each{
      int index = (int) it - 97
      aux1[index] = (aux1[index] ?: 0) + 1
    }

    // Put 1's due to str2
    str2.toCharArray().each{
      int index = (int) it - 97
      aux2[index] = (aux2[index] ?: 0) + 1
    }

    aux1 == aux2
  }

  String replaceSpaces(String s){

    // Count spaces
    int nSpaces = 0
    s.toCharArray().each {
      if( it == " " ){
        nSpaces ++
      }
    }

    // Result size reserved
    char[] result = new char[s.length() + nSpaces*2]

    // Build result
    int i = 0
    s.toCharArray().each {
      if( it != " ") {
        result[i] = it
      }
      else{
        result[i] = '%'
        result[++i] = '2'
        result[++i] = '0'
      }
      i++
    }

    // return result
    println(result)
    result.toString()
  }




}
