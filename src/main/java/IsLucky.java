/**
 * Created by anallely.olivares on 11/29/2017.
 */
public class IsLucky {

    boolean isLucky(int n) {

        int divisor = 100000;
        int index = 0;
        int effectiveIndex = -1;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        int size = 0;

        while( divisor >= 1 ){
            int current = (n / divisor);
            if( current != 0 || effectiveIndex != -1){
                size = size == 0 ? 6 - index : size;
                effectiveIndex = effectiveIndex == -1 ? 1 : effectiveIndex ;
                if( effectiveIndex <= size / 2  ){
                    firstHalfSum += current;
                } else {
                    secondHalfSum += current;
                }
                effectiveIndex += 1;
                n = n - (current*divisor);
            }
            index = index + 1;
            divisor /= 10;
        }
        return firstHalfSum == secondHalfSum;
    }
}
