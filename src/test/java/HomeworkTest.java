import org.junit.Test;
import task_1.Names;
import task_2.UpperCase;
import task_3.Separate;
import task_4.GenerateStream;
import task_5.Mixing;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class HomeworkTest {

    @Test
    public void main() {
        Names names = new Names();

        assertEquals("1. Ivan, 3. Peter, 5. Sam, ",
                names.sortingName(Arrays.asList("Tom", "Ivan", "Den", "Peter", "Liza", "Sam")));

        UpperCase upperCase = new UpperCase();
        assertEquals(Arrays.asList("TOM", "SAM", "PETER", "LIZA", "IVAN", "DEN"),
                upperCase.upperCaseAndSort(Arrays.asList("Tom", "Ivan", "Den", "Peter", "Liza", "Sam")));

        Separate separate = new Separate();
        assertEquals(Arrays.asList("0", "1", "2", "4", "5"),
                separate.separate(Arrays.asList("1, 2, 0", "4, 5")));

        GenerateStream generateStream = new GenerateStream();
        assertEquals("[0, 11, 48, 27, 20, 1, 28, 37, 40, 41]",
                Arrays.toString(generateStream
                        .generatorStream(0, 25214903917L, 11, 2^48).toArray()));

        Mixing mixing = new Mixing();
        assertEquals(Arrays.asList(1, 31, 3, 76, 4, 33, 6, 12, 7, 68, 0, 22),
                mixing.zip(Stream.of(1, 3, 4, 6, 7, 0), Stream.of(31, 76, 33, 12, 68, 22))
                        .collect(Collectors.toList()));
    }
}