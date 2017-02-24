package syscom0220;

/**
 * Created by kim on 2017/2/20.
 */
public class SyscomStringUtils {
    public static boolean isDigit(String s) {

        if (s.length() > 1) {
            return false;
        }

        if (s.trim().equals("")) {
            return false;
        }
        if (checkDigit(s)) {
            return true;
        }
        return false;
    }

    private static boolean checkDigit(String s) {
        char c = s.charAt(0);
        return c >= 48 && c <= 57;
    }
}
