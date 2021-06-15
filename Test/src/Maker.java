import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String email = "hello.java@gmail.company.com";
        Pattern pattern = Pattern.compile("^[\\w\\.]+@[\\w\\.]+$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }
}
