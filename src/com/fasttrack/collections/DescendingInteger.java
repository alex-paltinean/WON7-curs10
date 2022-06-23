package com.fasttrack.collections;

public class DescendingInteger implements Comparable<DescendingInteger> {
    private Integer value;

    public DescendingInteger(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public int compareTo(DescendingInteger o) {
        return -(value - o.value);
    }
}
