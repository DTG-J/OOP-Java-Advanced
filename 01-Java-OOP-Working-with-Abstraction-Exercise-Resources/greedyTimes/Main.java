
package  workingWithAbstraction.greedyTimes;



import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long input = Long.parseLong(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");

        var bag = new LinkedHashMap<String, LinkedHashMap<String, Long>>();
        long gold = 0;
        long stones = 0;
        long money = 0;

        for (int i = 0; i < safe.length; i += 2) {
            String name = safe[i];
            long count = Long.parseLong(safe[i + 1]);

            String type = "";

            if (name.length() == 3) {
                type = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                type = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                type = "Gold";
            }

            if (type.equals("")) {
                continue;
            } else if (input < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + count) {
                continue;
            }

            switch (type) {
                case "Gem":
                    if (!bag.containsKey(type)) {
                        if (bag.containsKey("Gold")) {
                            if (count > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(type).values().stream().mapToLong(e -> e).sum() + count > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(type)) {
                        if (bag.containsKey("Gem")) {
                            if (count > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(type).values().stream().mapToLong(e -> e).sum() + count > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(type)) {
                bag.put((type), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(type).containsKey(name)) {
                bag.get(type).put(name, 0L);
            }


            bag.get(type).put(name, bag.get(type).get(name) + count);
            if (type.equals("Gold")) {
                gold += count;
            } else if (type.equals("Gem")) {
                stones += count;
            } else if (type.equals("Cash")) {
                money += count;
            }
        }

        for (var x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}