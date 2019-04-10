package strings;

public class StringRotation {


    /**
     * We need to determine if candidate string is a rotation from original, only 1 substring operation
     * is allowed
     * @param base
     * @param candidate
     * @return
     */
    static boolean isARotation(String base, String candidate) {
        if ( base.length() != candidate.length()) {
            return false;
        }

        return (base + base).contains(candidate);
    }
}
