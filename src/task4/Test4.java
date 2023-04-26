package task4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        Test4 test4 = new Test4();
        test4.endlessStream();
    }

    public void endlessStream() {
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        Stream<Long> stream = Stream.iterate(0L, x -> (a * x + c) % m);
        stream
                .limit(12)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
