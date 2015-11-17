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



}
