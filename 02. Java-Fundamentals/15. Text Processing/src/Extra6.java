import java.util.Date;

public class Extra6 {
    public static void main(String[] args) {

        Date start = new Date();
        String repeated = repeatWithStringBuilder("a", 10000);
        Date end = new Date();

        long ms = end.getTime() - start.getTime();
        System.out.println(ms);
    }

    private static String repeatWithStringConcat(String word, int count) {
        String repeated = "";
        for (int i = 0; i < count; i++) {
            repeated += word;
        }
        return repeated;
    }

    private static String repeat(String word, int count) {
        String[] repeatArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArr[i] = word;
        }

        return String.join("", repeatArr);
    }

    private static String repeatWithStringBuilder(String word, int count) {
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < count; i++) {
            repeated.append(word);
        }
        return repeated.toString();
    }
}
