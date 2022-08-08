public class LogLevels {
    public static String message(String logLine) {
        String[] res = logLine.split(" ");
        return res[1].trim();
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");
    }

    public static String logLevel(String logLine) {
        String[] res = logLine.split(":");
        return res[0].replace("[","").replace("]", "").toLowerCase();

        //throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
    }

    public static String reformat(String logLine) {
        String[] res = logLine.split(":");
        return res[1].trim() + " " +  res[0].replace("[", "(").replace("]",")").toLowerCase();

        //throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }
}
