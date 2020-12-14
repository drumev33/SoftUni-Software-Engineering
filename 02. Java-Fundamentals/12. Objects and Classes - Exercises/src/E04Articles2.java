import java.util.ArrayList;
import java.util.Scanner;

public class E04Articles2 {
    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public String toString() {
            return String.format("%s - %s: %s",
                    getTitle(),
                    getContent(),
                    getAuthor());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayList<Article> articleList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            String title = data[0];
            String content = data[1];
            String author = data[2];

            Article article = new Article(title, content, author);
            articleList.add(article);
        }
        String input = scanner.nextLine();
        if (input.equals("title")) {
            articleList.stream()
                    .sorted((p1,p2) -> p1.getTitle().compareTo(p2.getTitle()))
                    .forEach(article -> System.out.println(article.toString()));
        } else if (input.equals("content")) {
            articleList.stream()
                    .sorted((p1,p2) -> p1.getContent().compareTo(p2.getContent()))
                    .forEach(article -> System.out.println(article.toString()));
        } else if (input.equals("author")) {
            articleList.stream()
                    .sorted((p1,p2) -> p1.getAuthor().compareTo(p2.getAuthor()))
                    .forEach(article -> System.out.println(article.toString()));
        }
    }
}
