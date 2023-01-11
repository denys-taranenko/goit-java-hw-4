package task_2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {

    public List<String> upperCaseAndSort(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
