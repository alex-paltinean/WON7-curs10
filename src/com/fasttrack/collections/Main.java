package com.fasttrack.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(4);
        integers.add(1);
        integers.add(2);
        integers.add(5);
        integers.add(1);
//        System.out.println(integers);

        Set<Integer> set = Set.of(5, 3, 2, 6);
//        System.out.println(set);
        SortedSet<Integer> sortedSet = new TreeSet<>(set);
//        System.out.println(sortedSet);

        SortedSet<DescendingInteger> descendingIntegers = new TreeSet<>();
        descendingIntegers.add(new DescendingInteger(3));
        descendingIntegers.add(new DescendingInteger(1));
        descendingIntegers.add(new DescendingInteger(4));
        descendingIntegers.add(new DescendingInteger(8));
        descendingIntegers.add(new DescendingInteger(2));
        System.out.println(descendingIntegers);
    }
}
