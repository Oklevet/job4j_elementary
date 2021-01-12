package ru.job4j.map;

import java.util.*;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        List<String> strs = new ArrayList<>();
        for (String s : strings) {
            strs.add(s);
        }
        String first;

        Iterator<String> it = strs.iterator();
        while (it.hasNext()) {
            List<String> itemList = new ArrayList<>();
            itemList.add(it.next());
            first = it.next().substring(0, 1);
            rsl.putIfAbsent(first, itemList);
            //it.remove();

            Iterator<String> itIn = strs.iterator();
            while (itIn.hasNext()) {
                if (first.equals(itIn.next().substring(0, 1))) {
                    rsl.get(first).add(itIn.next());
                    //itIn.remove();
                }
            }
        }
        return rsl;
    }
}
