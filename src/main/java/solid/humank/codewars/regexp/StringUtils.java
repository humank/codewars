package solid.humank.codewars.regexp;

/**
 * Created by kim on 2017/2/14.
 */
public class StringUtils {
    public static boolean isDigit(String s) {

        boolean isDigit = true;

        isDigit = isDigit && isSingleChar(s);
        isDigit = isDigit && digitCheck(s);

        return isDigit;
    }

    private static boolean isSingleChar(String s) {
        return s.length() == 1;
    }

    private static boolean digitCheck(String s) {
        //0-9 , ascii range is 48~57

        char c = s.charAt(0);
        return c>=48 && c<=57;
    }
}
