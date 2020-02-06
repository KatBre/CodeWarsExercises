public class BuildString {
    public static String buildString(String... args) {

        String buildString = "I like ";
        if(args.length == 0) {
            return buildString + "!";
        }
        for(int i = 0; i < args.length; i++) {
            if(i == args.length-1) {
                buildString += args[i] + "!";
            } else {
                buildString += args[i] + ", ";
            }
        }
        return buildString;
    }
}
