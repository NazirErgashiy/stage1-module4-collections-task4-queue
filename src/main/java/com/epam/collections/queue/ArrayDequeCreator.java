package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> mainArrayDeque = new ArrayDeque<>();
        Deque<Integer> firstPlayer = new ArrayDeque<>(firstQueue);
        Deque<Integer> secondPlayer = new ArrayDeque<>(secondQueue);

        mainArrayDeque.add(Objects.requireNonNull(firstPlayer.pollFirst()));
        mainArrayDeque.add(Objects.requireNonNull(firstPlayer.pollFirst()));
        mainArrayDeque.add(Objects.requireNonNull(secondPlayer.pollFirst()));
        mainArrayDeque.add(Objects.requireNonNull(secondPlayer.pollFirst()));

        while (!firstPlayer.isEmpty()&&!secondPlayer.isEmpty()) {
            firstPlayer.addLast(mainArrayDeque.pollLast());
            mainArrayDeque.add(Objects.requireNonNull(firstPlayer.pollFirst()));
            mainArrayDeque.add(Objects.requireNonNull(firstPlayer.pollFirst()));

            secondPlayer.addLast(mainArrayDeque.pollLast());
            mainArrayDeque.add(Objects.requireNonNull(secondPlayer.pollFirst()));
            mainArrayDeque.add(Objects.requireNonNull(secondPlayer.pollFirst()));
        }
        return mainArrayDeque;
    }
}
