import java.util.ArrayList;
import java.util.Scanner;

public class E04Songs2 {
    static class Song {
        String typeList;
        String name;
        String time;

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfSongs = Integer.parseInt(scanner.nextLine());

        ArrayList<Song> songsList = new ArrayList<>();

        for (int i = 0; i < numbersOfSongs; i++) {
            String[] input = scanner.nextLine().split("_");

            String type = input[0];
            String name = input[1];
            String time = input[2];

            Song songs = new Song();

            songs.setTypeList(type);
            songs.setName(name);
            songs.setTime(time);

            songsList.add(songs);
        }

        String input = scanner.nextLine();
        if (input.equals("all")) {
            for (Song song : songsList) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songsList) {
                if (song.getTypeList().equals(input)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
