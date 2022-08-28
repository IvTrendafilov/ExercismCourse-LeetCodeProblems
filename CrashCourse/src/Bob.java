public class Bob {
    public String hey(String sentece) {
        sentece.trim();
        String res = sentece;
        if (sentece.equals("")) {
            return "Fine. Be that way!";
        } else if (sentece.contains(res.toUpperCase())) {
            if (sentece.charAt(sentece.length() - 1) == '?') {
                return "Calm down, I know what I'm doing!";
            } else {
                return "Whoa, chill out!";

            }
        } else if (sentece.charAt(sentece.length() - 1) == '?') {
            return "Sure.";
        } else {
            return "Whatever.";
        }
    }

    public static void main(String[] args) {
        Bob bob = new Bob();
        System.out.println(bob.hey("\n  "));

    }
}
