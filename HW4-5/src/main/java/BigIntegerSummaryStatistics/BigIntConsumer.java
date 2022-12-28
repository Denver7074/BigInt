package BigIntegerSummaryStatistics;

import java.math.BigInteger;
import java.util.Objects;
import java.util.function.IntConsumer;

public interface BigIntConsumer {

    void accept(BigInteger value);

    default BigIntConsumer andThen(BigIntConsumer after) {
        Objects.requireNonNull(after);
        return (BigInteger t) -> { accept(t); after.accept(t); };
    }
}
