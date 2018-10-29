package strings;

public class URLify {

    static public char[] doURLify(char[] input, int size) {
        int j = input.length - 1;

        for ( int i = input.length - 1; i >= 0; i-- ) {

            if( i >= size) {
                continue;
            }

            if( input[i] != ' ' ) {
                input[j--] = input[i];
            } else {
                input[j--] = '0';
                input[j--] = '2';
                input[j--] = '%';
            }
        }
        return input;
    }




}
