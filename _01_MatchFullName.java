import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 18.06.2016.
 */
public class _01_MatchFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("\\b[A-Z{1}][a-z]*\\s[A-Z{1}][a-z]*\\b");
        Matcher matcher = pattern.matcher(input);

        while (true) {
            if(input.equals("end")){
                break;
            }
            while (matcher.find()) {
                String fullName = matcher.group();
                System.out.println(fullName);
            }
            input = scan.nextLine();
        }
    }
}
