import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Task1 {

    public List<Integer> doIt(int noNumbers) {
        IntStream stream = IntStream.iterate(1, value -> value + 1).map(value->value*value).limit(noNumbers);
        return collectToList(stream);
    }

    private List<Integer> collectToList(IntStream stream) {
        return stream.collect((Supplier<List<Integer>>) ArrayList::new,
                              List::add,
                              (left, right) -> left.addAll(right));
    }
}
