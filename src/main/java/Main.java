import task_1.Names;
import task_2.UpperCase;
import task_3.Separate;
import task_4.GenerateStream;
import task_5.Mixing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add(0, "Tom");
        stringList.add(1, "Ivan");
        stringList.add(2, "Den");
        stringList.add(3, "Peter");
        stringList.add(4, "Liza");
        stringList.add(5, "Sam");

        String[] numberArray = new String[] {"1, 2, 0", "4, 5"};

        List<Integer> first = Arrays.asList(1, 3, 4, 6, 7, 0);
        Stream<Integer> firstStream = first.stream();

        List<Integer> second = Arrays.asList(31, 76, 33, 12, 68, 22);
        Stream<Integer> secondStream = second.stream();

        Names names = new Names();
        System.out.println(names.sortingName(stringList)); //1. Ivan, 3. Peter, 5. Sam

        UpperCase upperCase = new UpperCase();
        System.out.println(upperCase.upperCaseAndSort(stringList)); //[TOM, SAM, PETER, LIZA, IVAN, DEN]

        Separate separate = new Separate();
        System.out.println(separate.separate(List.of(numberArray))); //[0, 1, 2, 4, 5]

        GenerateStream generateStream = new GenerateStream();
        System.out.println(Arrays.toString(generateStream
                .generatorStream(0, 25214903917L, 11, 2^48).toArray())); //[0, 11, 48, 27, 20, 1, 28, 37, 40, 41]

        Mixing mixing = new Mixing();
        System.out.println(Arrays.toString(mixing.zip(firstStream, secondStream).toArray())); //[1, 31, 3, 76, 4, 33, 6, 12, 7, 68, 0, 22]
    }
}
