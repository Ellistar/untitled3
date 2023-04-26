package task1;

import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> name = List.of("Gandalf", "Frodo", "Legolas", "Gimli", "Boromir", "Aragorn", "Sam", "Pipin", "Merry");
        System.out.println(sortNames(name));
    }

    public static String sortNames(List<String> names) {
        return names.stream()
                .filter(name -> names.indexOf(name) %2 != 0)
                .map(name -> names.indexOf(name) + ". " + name)
                .collect(Collectors.joining(" "));
    }
}
