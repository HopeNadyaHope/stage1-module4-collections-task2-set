package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer element : sourceList) {
            result.add(element);
            if (element % 2 == 0) {
                int x = element;
                do {
                    x /= 2;
                    result.add(x);
                } while (x % 2 == 0);
            } else {
                result.add(element * 2);
            }
        }
        return result;
    }
}
