import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by anallely.olivares on 11/29/2017.
 */
public class CommonCharacterCount {

    int commonCharacterCount(String s1, String s2) {
        Map<Character, Integer> auxMap = new HashMap<Character, Integer>();
        Map<Character, Integer> auxMap2 = new HashMap<Character, Integer>();


        int nCharactersS1 = s1.length();
        for (int i = 0; i < nCharactersS1; i++) {
            char current = s1.charAt(i);
            Integer value = auxMap.get(current);
            if( value == null){
                value = 0;
            }
            auxMap.put(current, value + 1);
        }

        int nCharactersS2 = s2.length();
        for (int i = 0; i < nCharactersS2; i++) {
            char current = s2.charAt(i);
            Integer value = auxMap2.get(current);
            if( value == null){
                value = 0;
            }
            auxMap2.put(current, value + 1);
        }

        Iterator it =auxMap.entrySet().iterator();


        int j = 0;
        while (it.hasNext()) {
            Map.Entry<Character, Integer> pair = (Map.Entry)it.next();
            if(auxMap2.containsKey(pair.getKey())){
                Integer map2Value = auxMap2.get(pair.getKey());
                if (pair.getValue() > map2Value){
                    j += map2Value;
                } else {
                    j += pair.getValue();
                }

            }
        }

        return j;
    }

}
