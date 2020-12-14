import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E06VehicleCatalogue {
    static class Vehicle {
        String vehicleType;
        String model;
        String color;
        int horsepower;

        public Vehicle(String vehicleType, String model, String color, int horsepower) {
            this.vehicleType = vehicleType;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getVehicleType() {
            return vehicleType;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public String toString() {
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                    getVehicleType().toUpperCase().charAt(0) + getVehicleType().substring(1),
                    getModel(),
                    getColor(),
                    getHorsepower());
        }
    }

    public static double averageHorsePower(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0.0;
        }
        return vehicles.stream().mapToDouble(Vehicle::getHorsepower).sum() / vehicles.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String vehicleType = data[0];
            String model = data[1];
            String color = data[2];
            int horsepower= Integer.parseInt(data[3]);

            Vehicle vehicle = new Vehicle(vehicleType, model, color, horsepower);
            vehicleList.add(vehicle);

            input = scanner.nextLine();
        }

            input = scanner.nextLine();

        while (!input.equals("Close the Catalogue")) {
            String model = input;

            vehicleList.stream()
                    .filter(vehicle -> vehicle.getModel().equals(model))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));

            input = scanner.nextLine();
        }

        List<Vehicle> cars = vehicleList.stream()
                .filter(vehicle -> vehicle.getVehicleType().equals("car"))
                .collect(Collectors.toList());

        List<Vehicle> trucks = vehicleList.stream()
                .filter(vehicle -> vehicle.getVehicleType().equals("truck"))
                .collect(Collectors.toList());

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsePower(cars));
        System.out.printf("Trucks have average horsepower of: %.2f.", averageHorsePower(trucks));
    }
}
