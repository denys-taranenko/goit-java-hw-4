package task_3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Separate {

    public List<String> separate(List<String> list) {
        String separator = ", ";

        return list.stream()
                .map(x -> Arrays.asList(x.split(separator)))
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());
    }
}
