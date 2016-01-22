import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Task1 {

    public List<Integer> doIt(int noNumbers) {
        IntStream stream = take(noNumbers, squaresOf(positiveNumbers()));
        return collectToList(stream);
    }

    private IntStream squaresOf(IntStream numbers) {
        return numbers.map(value->value*value);
    }

    private IntStream take(int noNumbers,
                           IntStream numbers) {return numbers.limit(noNumbers);}

    private IntStream positiveNumbers() {return IntStream.iterate(1, value -> value + 1);}

    private List<Integer> collectToList(IntStream stream) {
        return stream.collect((Supplier<List<Integer>>) ArrayList::new,
                              List::add,
                              (left, right) -> left.addAll(right));
    }
}
