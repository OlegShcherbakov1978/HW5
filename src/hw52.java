import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class hw52 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Иван Иванов");
        employees.add("Светлана Петрова");
        employees.add("Кристина Белова");
        employees.add("Анна Мусина");
        employees.add("Анна Крутова");
        employees.add("Иван Юрин");
        employees.add("Петр Лыков");
        employees.add("Павел Чернов");
        employees.add("Петр Чернышов");
        employees.add("Мария Федорова");
        employees.add("Марина Светлова");
        employees.add("Мария Савина");
        employees.add("Мария Рыкова");
        employees.add("Марина Лугова");
        employees.add("Анна Владимирова");
        employees.add("Иван Мечников");
        employees.add("Петр Петин");
        employees.add("Иван Ежов");

        Map<String, Integer> nameCounts = countNames(employees);
        Map<Integer, String> sortedNameCounts = sortByValueDescending(nameCounts);

        for (Map.Entry<Integer, String> entry : sortedNameCounts.entrySet()) {
            String name = entry.getValue();
            int count = entry.getKey();
            System.out.println(name + ": " + count + " повторений");
        }
    }

    public static Map<String, Integer> countNames(List<String> names) {
        Map<String, Integer> nameCounts = new HashMap<>();
        for (String name : names) {
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }
        return nameCounts;
    }

    public static Map<Integer, String> sortByValueDescending(Map<String, Integer> map) {
        Map<Integer, String> sortedMap = new TreeMap<>((a, b) -> b.compareTo(a));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }
        return sortedMap;
    }
}
