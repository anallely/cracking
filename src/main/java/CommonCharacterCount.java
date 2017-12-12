import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by anallely.olivares on 11/29/2017.
 */
public class CommonCharacterCount {

    int commonCharacterCount(String s1, String s2) {
        int nCharactersS1 = s1.length();
        Map<Character, Integer> auxMap = new HashMap<>();

        for (int i = 0; i < nCharactersS1; i++) {
            char current = s1.charAt(i);
            Integer value = auxMap.get(current);
            if( value == null){
                auxMap.put(current, 1);
            }
        }

        int nCharactersS2 = s2.length();
        for (int i = 0; i < nCharactersS2; i++) {
            char current = s2.charAt(i);
            Integer value = auxMap.get(current);
            if ( value != null && value == 1) {
                auxMap.put(current, 2);
            }
        }

        Iterator it =auxMap.entrySet().iterator();
        int j = 0;
        while (it.hasNext()) {
            Map.Entry<Character, Integer> pair = (Map.Entry)it.next();
            if(pair.getValue() == 2){
                j++;
            }
        }

        return j;
    }

}
