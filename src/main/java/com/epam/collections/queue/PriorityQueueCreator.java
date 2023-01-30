package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queue = new PriorityQueue<>(new Sorter());
        queue.addAll(firstList);
        queue.addAll(secondList);
        return queue;
    }
}

class Sorter implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int compare = a.compareTo(b);
        return -compare;
    }
}
