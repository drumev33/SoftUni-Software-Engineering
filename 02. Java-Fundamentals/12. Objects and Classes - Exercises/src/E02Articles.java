import java.util.Scanner;

public class E02Articles {
    static class Article {
        String Title;
        String Content;
        String Author;

        public Article(String title, String content, String author) {
            Title = title;
            Content = content;
            Author = author;
        }

        public String getTitle() {
            return Title;
        }

        public String getContent() {
            return Content;
        }

        public String getAuthor() {
            return Author;
        }

        public void renameTitle(String title) {
            Title = title;
        }

        public void editContent(String content) {
            Content = content;
        }

        public void changeAuthor(String author) {
            Author = author;
        }

        public String toString() {
            return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(", ");
        String title = data[0];
        String content = data[1];
        String author = data[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(": ");
            String command = input[0];

            switch (command) {
                case "Edit":
                    article.editContent(input[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(input[1]);
                    break;
                case "Rename":
                    article.renameTitle(input[1]);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
