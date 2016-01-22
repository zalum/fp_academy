import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Task1 {

    public List<Integer> doIt(int noNumbers) {
        IntStream positiveNumbers = positiveNumbers();
        IntStream stream = take(noNumbers, positiveNumbers);
        return collectToList(stream);
    }

    private IntStream take(int noNumbers,
                           IntStream positiveNumbers) {return positiveNumbers.limit(noNumbers).map(value -> value * value);}

    private IntStream positiveNumbers() {return IntStream.iterate(1, value -> value + 1);}

    private List<Integer> collectToList(IntStream stream) {
        return stream.collect((Supplier<List<Integer>>) ArrayList::new,
                              List::add,
                              (left, right) -> left.addAll(right));
    }
}
