/**
 * Created by anallely.olivares on 11/29/2017.
 */
public class Intro {

    boolean almostIncreasingSequence(int[] sequence) {
        int n = sequence.length;
        int badTimes = 0;
        int first = sequence[0];

        int preLastOk = first;
        boolean preLastOkSet = false;

        for( int i = 1; i < n; i++ ){

            if( badTimes > 1){
                break;
            }

            if( first < sequence[i]){
                System.out.println("Ok: " + first + " " + sequence[i]);
                preLastOk = first;
                preLastOkSet = true;
                first = sequence[i];
            } else {
                badTimes++;
                if ( (i+1 < n && (preLastOkSet && first < sequence[i+1] || !preLastOkSet)) || i+1 >=n ){
                    first = sequence[i];
                }
                else {
                    first = preLastOk;
                    i = i -1;
                }
            }
        }
        return !(badTimes > 1);
    }

}
