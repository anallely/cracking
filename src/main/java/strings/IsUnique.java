package strings;

public class IsUnique {


    static public boolean isUnique(String input) {
        boolean result = true;

        for( int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);
            for ( int j = 0; j < input.length(); j++ ) {
                if ( i == j ) {
                    continue;
                } else {
                    if ( currentCharacter != input.charAt(j) ) {
                        continue;
                    } else {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }

}
