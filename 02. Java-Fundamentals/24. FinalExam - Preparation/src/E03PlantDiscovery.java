import java.util.*;

public class E03PlantDiscovery {

    static class Plant {
        String name;
        int rarity;
        List<Double> ratings;

        public Plant(String name, int rarity) {
            this.name = name;
            this.rarity = rarity;
            this.ratings = new ArrayList<>();
        }

        public int getRarity() {
            return rarity;
        }

        public String getName() {
            return name;
        }

        public void addRating(double rating) {
            this.ratings.add(rating);
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public void resetRaiting() {
            this.ratings.clear();
        }

        public double getAvarageRating() {
            if (this.ratings.isEmpty()) {
                return 0;
            }
            double averageRating = 0;
            for (Double rating : this.ratings) {
                averageRating += rating;
            }
            averageRating = averageRating / this.ratings.size();
            return  averageRating;
        }
    }

    public static void main(String[] args) {
        Map<String, Plant> plantsByName = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] nameAndRarity = scanner.nextLine().split("<->");
            Plant p = new Plant(nameAndRarity[0], Integer.parseInt(nameAndRarity[1]));
            plantsByName.put(p.getName(), p);
        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String[] commandAndParameters = command.split(": ");

            switch (commandAndParameters[0]) {
                case "Rate":
                    String[] rateParameters = commandAndParameters[1].split(" - ");
                    String ratePlantName = rateParameters[0];
                    int rating = Integer.parseInt(rateParameters[1]);

                    Plant ratePlant = plantsByName.get(ratePlantName);
                    if (ratePlant != null) {
                        ratePlant.addRating(rating);
                    } else {
                        System.out.println("error");
                    }

                    break;
                case "Update":
                    String[] updateParameters = commandAndParameters[1].split(" - ");
                    String updatePlantName = updateParameters[0];
                    int rarity = Integer.parseInt(updateParameters[1]);

                    Plant updatePlant = plantsByName.get(updatePlantName);
                    if (updatePlant != null) {
                        updatePlant.setRarity(rarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    String resetPlantName = commandAndParameters[1];

                    Plant resetPlant = plantsByName.get(resetPlantName);
                    if (resetPlant != null) {
                        resetPlant.resetRaiting();
                    } else {
                        System.out.println("error");
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        plantsByName.values()
                .stream()
                .map(p -> "- " + p.getName() + "; Rarity: " + p.getRarity() + "; Rating: " + String.format("%.2f", p.getAvarageRating()))
                .forEach(s -> System.out.println(s));
    }
}
