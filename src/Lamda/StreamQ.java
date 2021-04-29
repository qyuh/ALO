package Lamda;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamQ {

    public static void main(String[] args) {
        Arrays.asList("a1", "a2", "a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("***");
        //
        Stream.of("a1", "a2", "a3")
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("***");
        //

        IntStream.range(1, 5)
                .forEach(System.out::println);

        System.out.println("***");
        //

        Arrays.stream(new int[] {1, 2, 5, 6})
                .map(s -> s + 1)
                .average()
                .ifPresent(System.out::println);

        System.out.println("***");
        //


        Stream.of("a1", "a2", "a23")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);


        System.out.println("***");
        //
        IntStream.range(1, 4)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);


        System.out.println("***");
        //
        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);


    }
}
