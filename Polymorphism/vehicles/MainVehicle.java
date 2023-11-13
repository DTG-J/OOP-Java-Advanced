package polimorphism.vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainVehicle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        Vehicle vehicle1 = new Car(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));

        tokens = scanner.nextLine().split("\\s+");
        Vehicle vehicle2 = new Truck(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("polimorphism.vehicles.Car", vehicle1);
        vehicleMap.put("polimorphism.vehicles.Truck", vehicle2);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            tokens = scanner.nextLine().split("\\s+");

            Vehicle vehicle = vehicleMap.get(tokens [1]);
            double parameter = Double.parseDouble(tokens[2]);
            switch (tokens [0]){
                case "Drive":
                    vehicle.drive(parameter);
                    break;
                case "Refuel":
                    vehicle.refuel(parameter);
                    break;
            }


        }

vehicleMap.values().forEach(System.out::println);
        System.out.println();

    }
}
