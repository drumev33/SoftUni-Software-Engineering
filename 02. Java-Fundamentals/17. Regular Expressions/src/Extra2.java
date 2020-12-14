import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extra2 {
    public static void main(String[] args) {
        String datesExpression = "\\b(?<day>\\d\\d?)-(?<month>[A-Z][a-z]{2})-(?<year>\\d{4})\\b";
        String textDate = "I am born on 30-Dec-1994. " +
                "My Father is born on the 9-Jul-1955." +
                "01-July-2000 is not a valid date";

        String replace = textDate.replaceAll(datesExpression, "[CENSORED]");
        System.out.println(replace);

        Pattern patternDate = Pattern.compile(datesExpression);
        Matcher matcherDate = patternDate.matcher(textDate);

        while (matcherDate.find()) {
            System.out.println(matcherDate.group());
            System.out.println(matcherDate.group("month"));
        }


//        String expression = "[A-Z][A-Za-z]+";
//        String text = "Hello regular expressions, " +
//                "this is l3cture number 7 in the java " +
//                "fundamentals cour at SoftUni in 2020";
//
//        Pattern pattern = Pattern.compile(expression);
//        Matcher matcher = pattern.matcher(text);
//
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }
    }
}
