package task2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<String> name = List.of("Gandalf", "Frodo", "Legolas", "Gimli", "Boromir", "Aragorn", "Sam", "Pipin", "Merry");
        System.out.println(namesToUpperCase(name));
    }

    public static String namesToUpperCase(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));
    }
}
