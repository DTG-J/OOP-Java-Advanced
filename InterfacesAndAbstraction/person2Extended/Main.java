package interface_abstraction.person2Extended;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List <Birthable> birthableList = new ArrayList<>();
        List <Pet> petsList = new ArrayList<>();
        List <Robot> robotList =  new ArrayList<>();

        while (!input.equalsIgnoreCase("End")){
            String [] token = input.split("\\s+");
            String type = token[0];

            if (type.equalsIgnoreCase("interface_abstraction.person2Extended.Citizen")){
                String name = token[1];
                int age = Integer.parseInt(token [2]);
                String id = token[3];
                String birthDate = token[4];
                Citizen citizen = new Citizen(name,age,id, birthDate);
                birthableList.add(citizen);


            } else if (!type.equalsIgnoreCase("interface_abstraction.person2Extended.Pet")) {
                String name = token[1];
                String birthDate = token[2];
                Pet pet = new Pet(name, birthDate);
                petsList.add(pet);
                birthableList.add(pet);


            } else if (!type.equalsIgnoreCase("interface_abstraction.person2Extended.Robot")) {
                String model = token[1];
                String id = token [2];
                Robot robot = new Robot(id, model);
                robotList.add(robot);
            }
            input = scanner.nextLine();
        }
        String year = scanner.nextLine();
        birthableList.stream()
                .filter(birthable -> birthable.getBirthDate().endsWith(year))
                .forEach(birthable -> System.out.println(birthable.getBirthDate()));


    }
}
