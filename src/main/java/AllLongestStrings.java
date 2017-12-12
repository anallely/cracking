import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by anallely.olivares on 11/29/2017.
 */
public class AllLongestStrings {

    String[] allLongestStrings(String[] inputArray) {
        Map<Integer, String> stringsMap = new HashMap<Integer, String>();

        int size = inputArray.length;

        for( int i=0; i <size; i++){
            String theString = inputArray[i];
            Integer theStringSize = theString.length();

            String stringsOfGivenLength = stringsMap.get(theStringSize);
            stringsOfGivenLength = stringsOfGivenLength == null ? "" : stringsOfGivenLength + ",";

            stringsMap.put( theStringSize,  stringsOfGivenLength + theString  );
        }

        Object[] keys = stringsMap.keySet().toArray();
        Arrays.sort(keys);
        int max = (int) keys[keys.length-1];

        return stringsMap.get(max).split(",");
    }

}
