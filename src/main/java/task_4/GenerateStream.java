package task_4;

import java.util.stream.Stream;

public class GenerateStream {

    public Stream<Long> generatorStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m)
                .limit(10) //Because the Exception OutOfMemoryError
                .toList().stream();

    }
}
