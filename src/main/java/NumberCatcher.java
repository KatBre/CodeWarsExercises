public class NumberCatcher {

    public static boolean isNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
