import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Integer[] numbers = {5, -2, 10, -8, 3, -1, 0, 7};
        List<Integer> numberList = Arrays.asList(numbers);
        Predicate<Integer> isPositive = number -> number > 0;
        numberList.stream()
                .filter(isPositive)
                .forEach(System.out::println);
    }
}
