package BigIntegerSummaryStatistics;

import java.math.BigInteger;
import java.util.IntSummaryStatistics;


public class BigIntSummaryStatistics implements BigIntConsumer {

    private long count;
    private BigInteger sum = BigInteger.valueOf(0);
    private BigInteger min = BigInteger.valueOf(Integer.MIN_VALUE);
    private BigInteger max = BigInteger.valueOf(Integer.MAX_VALUE);


    public BigIntSummaryStatistics(){}

    public BigIntSummaryStatistics(long count,BigInteger sum,BigInteger min,BigInteger max){
        this.count = count;
        this.sum = sum;
        this.min = min;
        this.max = max;
    }
    @Override
    public void accept(BigInteger value) {
        ++count;
        sum.add(value);
        min = min.min(value);
        max = max.max(value);
    }

    public void combine(BigIntSummaryStatistics other) {
        count += other.count;
        sum.add(other.sum);
        min = min.min(other.min);
        max = max.max(other.max);
    }
    public final long getCount() {return count;}
    public final BigInteger getSum() {return sum;}
    public final BigInteger getMin() {return min;}
    public final BigInteger getMax() {return max;}
    public final BigInteger getAverage() {return sum.divide(BigInteger.valueOf(count));
    }
    @Override
    public String toString() {
        return String.format(
                "%s{count=%d, sum=%d, min=%d, average=%f, max=%d}",
                this.getClass().getSimpleName(),
                getCount(),
                getSum(),
                getMin(),
                getAverage(),
                getMax());
    }

//    @Override
//    public BigIntConsumer andThen(BigIntConsumer after) {
//        return BigIntConsumer.super.andThen(after);
//    }
}
