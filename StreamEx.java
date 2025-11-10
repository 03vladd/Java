import java.util.*;
import java.util.stream.Stream;


public class StreamEx {
    public static void main(String[] args) {

        //1.1
        List<Integer> numbers =  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> EvenNumbers = numbers.stream()
                .filter(n ->n % 2 == 0)
                .toList();

        System.out.println(EvenNumbers);

        //1.2
        List<Integer> OddNumbers = numbers.stream()
                .filter(n -> n % 2 ==1)
                .toList();

        System.out.println(OddNumbers);

        //2

        List<String> words = Arrays.asList("hello", "world", "goodbye", "world");

        words.stream()
                .map(s -> s.toUpperCase())
                .sorted()
                .forEach(System.out::println);

        //3
        numbers.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        //4
        words.stream()
                .distinct()
                .forEach(System.out::println);

        //5
//        student.stream()
//                .filter(s -> s.age > 18)
//                .forEach(System.out::println);

        //6
        List<String> word = Arrays.asList("cat", "dog", "elephant", "bird", "apple");

        long count = words.stream()
                .filter(w -> w.length() > 3)
                .count();

        System.out.println(count);

        //7
        List<Integer> square = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted(Collections.reverseOrder())
                .toList();

        System.out.println(square);
    }
}
