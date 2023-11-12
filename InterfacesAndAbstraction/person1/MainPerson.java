package interface_abstraction.person1;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {
        Class[] citizenInterfaces = Citizen.class.getInterfaces();
        if (Arrays.asList(citizenInterfaces).contains(Birthable.class)
                && Arrays.asList(citizenInterfaces).contains(Identifiable.class)) {
            Method[] methods = Birthable.class.getDeclaredMethods();
            Method[] methods1 = Identifiable.class.getDeclaredMethods();
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String id = scanner.nextLine();
            String birthDate = scanner.nextLine();
            Identifiable identifiable = new Citizen(name,age,id,birthDate);
            Birthable birthable = new Citizen(name,age,id,birthDate);
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
            System.out.println(methods1.length);
            System.out.println(methods1[0].getReturnType().getSimpleName());
        }

        /*Class[] citizenInterfaces = interface_abstraction.person.person2Extended.Citizen.class.getInterfaces();
        if (Arrays.asList(citizenInterfaces).contains(interface_abstraction.person.Person.class)) {
            Method[] fields = interface_abstraction.person.Person.class.getDeclaredMethods();
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            interface_abstraction.person.Person interface_abstraction.person = new interface_abstraction.person.person2Extended.Citizen(name, age);
            System.out.println(fields.length);
            System.out.println(interface_abstraction.person.getName());
            System.out.println(interface_abstraction.person.getAge());

        }*/
    }
}
