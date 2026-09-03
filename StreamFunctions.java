package STREAMAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctions {

    public static long countEmptyStrings(Stream<String> stream) {
        return stream.filter(s -> s.isEmpty()).count();
    }

    public static long countStrings(Stream<String> stream, int length) {
        return stream.filter(s -> s.length() > length).count();
    }

    public static List<String> nonEmptyStringList(Stream<String> stream) {
        return stream
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
    }

    public static List<String> getStrings(Stream<String> stream, int length) {
        return stream
                .filter(s -> s.length() > length)
                .collect(Collectors.toList());
    }

    public static List<Integer> getSquareList(Stream<Integer> stream) {
        return stream
                .distinct()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static void showStatistics(Stream<Integer> stream) {
        List<Integer> numbers = stream.collect(Collectors.toList());

        System.out.println("Count: " + numbers.size());
        System.out.println("Min: " + numbers.stream().min(Integer::compareTo).get());
        System.out.println("Max: " + numbers.stream().max(Integer::compareTo).get());
        System.out.println("Sum: " + numbers.stream().mapToInt(Integer::intValue).sum());
        System.out.println("Average: " +
                numbers.stream().mapToInt(Integer::intValue).average().getAsDouble());
    }
}
