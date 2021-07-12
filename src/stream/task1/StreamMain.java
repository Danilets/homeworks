package stream.task1;

import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.stream()
                .filter(i -> i > 0)
                .filter(i -> i % 2 == 0)
                .sorted(Integer::compareTo)
                .forEach(System.out::println);
    }
}
