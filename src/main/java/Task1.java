import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Task1 {

    public List<Integer> doIt(int noNumbers) {
        List<Integer> result =
                IntStream.iterate(1, value -> value + 1).limit(noNumbers).collect((Supplier<List<Integer>>) ArrayList::new,
                                                                                  List::add,
                                                                                  (left, right) -> left.addAll(right));
        return result;
    }
}
