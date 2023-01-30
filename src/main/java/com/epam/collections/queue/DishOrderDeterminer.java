package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        List<Integer> sorted = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            list.add(i);
        }
        int id = 0;
        while (!list.isEmpty()) {
            for (Integer integer : list) {
                id++;
                if (id == everyDishNumberToEat) {
                    id = 0;
                    sorted.add(integer);
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (sorted.contains(list.get(i))) {
                    list.remove(i);
                }
            }
        }
        return sorted;
    }
}
