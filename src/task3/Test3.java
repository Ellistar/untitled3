package task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        String[] problem = {"1, 2, 0", "4, 5"};
        System.out.println(sortedAndJoined(problem));
    }

    public static String sortedAndJoined (String[] problem) {
        return Stream.of(problem)
                .map(res -> res.split(", "))
                .flatMap(Arrays::stream)
                .sorted(Comparator.comparingInt(Integer::parseInt))
                .collect(Collectors.joining(", "));
    }
}
