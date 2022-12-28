import BigIntegerSummaryStatistics.BigIntStream;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        HoweWork howeWork = new HoweWork();
        //Stream.iterate(0,a->a > 0 ? -a : -a + 1).forEach(System.out::println);
        String text = "123";
        //text.chars().mapToObj(i->(char) i).forEach(System.out::println);
        //IntStream.rangeClosed(0,100).mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") :(i % 5 == 0 ? "Buzz" : i)).forEach(System.out::println);
//        DoubleSummaryStatistics doubleSummaryStatistics = DoubleStream.of(doubles).summaryStatistics();
        ArrayList<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("Hello");
        list.add("XXX");
        list.add("YYY");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Hello");
        list2.add("XXX");
        list2.add("HHHH");
        list2.add("PPP");
        System.out.println(list.toString());
        System.out.println(list2.toString());
        list.remove(2);
        list2.remove(1);
        System.out.println(list.toString());
        System.out.println(list2.toString());
        list.set(0,"HHH");
        list2.set(0,"mmm");
        System.out.println(list.toString());
        System.out.println(list2.toString());
        list.add(1,"PPPP");
        System.out.println(list.toString());


        }

    }


