package BigIntegerSummaryStatistics;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.BaseStream;
import java.util.stream.Stream;

public interface BigIntStream extends BaseStream<BigInteger, BigIntStream> {

    public static Stream<String> of(String... values) {
        return Arrays.stream(values);
    }


}
