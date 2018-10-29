package strings;

public class CheckPermutation {


    // Using an integer array as aux
    static public boolean isPermutation(String a, String b) {

        if (a.length() != b.length()){
            return false;
        }

        boolean result = true;
        int[] aux = new int[256];

        // Initialize aux
        for( int i = 0; i < aux.length; i++ ) {
            aux[i] = 0;
        }

        // Increment in 1
        for( int i = 0; i < a.length(); i++ ) {
            int index = (int) a.charAt(i) - 32;
            aux[index] = aux[index] + 1;
        }

        // Subtracting in 1
        for( int i = 0; i < b.length(); i++ ) {
            int index = (int) b.charAt(i) - 32;
            aux[index] = aux[index] - 1;
        }

        // Check aux is all 0's
        for( int i = 0; i < aux.length; i++ ) {
            if (aux[i] != 0) {
                result = false;
                break;
            }
        }

        return result;
    }


    static public boolean isPermutationN2(String a, String b) {
        boolean result = true;
        char restrictedCharacter = '*';

        if (a.length() != b.length()){
            return false;
        }

        char[] bb = b.toCharArray();

        // Iterate over a
        for( int i = 0; i < a.length(); i++ ) {

            // Iterate over b
            for( int j = 0; j < bb.length; j++ ) {
                if ( a.charAt(i) == bb[j] ) {
                    bb[j] = restrictedCharacter;
                }
            }
        }

        // Check bb has all '*'
        for( int i = 0; i < bb.length; i++ ) {
            if (bb[i] != restrictedCharacter) {
                result = false;
                break;
            }
        }

         return result;
    }


}
