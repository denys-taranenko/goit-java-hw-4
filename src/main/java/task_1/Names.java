package task_1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Names {

    public String sortingName(List<String> nameList) {
        return IntStream.range(0, nameList.size())
                .boxed()
                .map(x -> x % 2 != 0? x + ". " + nameList.get(x) + ", " : "")
                .collect(Collectors.joining());
    }
}
