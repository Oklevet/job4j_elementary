package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> collect = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            Character c = s.charAt(i);
            // i - Variable used in lambda expression should be final or effectively final
            collect.computeIfPresent(c, (key, value) -> value.add(i));
            collect.computeIfAbsent(c, key -> list);
        }
        return collect;
    }
}
