import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by florin on 1/22/16.
 */
public class Task1Test {

    private Task1 task1 = new Task1();

    @Test
    public void shouldReturnNumbers() throws Exception {
        //given
        int numberOfNumbers = 25;
        //when
        List<Integer> result = task1.doIt(numberOfNumbers);

        //then
        assertThat(result).hasSize(numberOfNumbers);
    }

    @Test
    public void shouldReturnSquares() {
        //given
        int numberOfNumbers = 3;

        //when
        List<Integer> result = task1.doIt(numberOfNumbers);

        //then
        assertThat(result).containsSequence(1,4,9);
    }
}