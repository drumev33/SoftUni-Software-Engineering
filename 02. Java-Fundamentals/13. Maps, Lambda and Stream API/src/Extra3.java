import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Extra3 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("cats");
        words.add("buddnohewiser");
        words.add("dog");
        words.add("apple");
        words.add("organe");

        //The stream under this code does the same
//        List<String> filtered = new ArrayList<>();
//        for (String word : words) {
//            if (word.length() <= 5) {
//                filtered.add(word);
//            }
//            if (word.endsWith("e")) {
//                filtered.add(word);
//            }
//        }


//        Stream<String> stream = words.stream();
//        stream.filter(w -> w.endsWith("e"));
//        List<String> filtered = stream.collect(Collectors.toList());

        //The same like above
        List<String> filtered = words.stream()
                .filter(w -> w.length() <= 5)
                .map(w -> w.toUpperCase())
                .sorted((a, b) -> a.compareTo(b))
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .limit(1)
                .collect(Collectors.toList());

        System.out.println(String.join(" ", filtered));



        //Doesnt matter if it is o1 and o1 or asd1 and asd2
        Collections.sort(words, ((o1, o2) -> Integer.compare(o1.length(), o2.length())));

        //The same like above
//        Collections.sort(words, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        });

        System.out.println(String.join(" - ", words));
    }
}
