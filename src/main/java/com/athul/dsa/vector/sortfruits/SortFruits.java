package com.athul.dsa.vector.sortfruits;

import java.util.*;
import java.util.stream.Collectors;

class Pair {

    String first;
    int second;

    Pair(String name, int price) {
        this.first = name;
        this.second = price;
    }

    @Override
    public String toString() {
        return "[" + first + ", " + second + "]";
    }
}
public class SortFruits {
    public static void main(String[] args) {
        List<Pair> fruits = new ArrayList<>();
        fruits.add(new Pair("Mango", 100));
        fruits.add(new Pair("Guava", 70));
        fruits.add(new Pair("Grapes", 40));
        fruits.add(new Pair("Apple", 60));
        fruits.add(new Pair("Banana", 30));

        fruits.sort((o1, o2) -> o1.first.compareTo(o2.first));
//      fruits.sort(Comparator.comparing(o -> o.first));
        System.out.println(fruits);

        fruits.sort((o1, o2) -> Integer.compare(o1.second, o2.second));
//      fruits.sort(Comparator.comparingInt(o -> o.second));
        System.out.println(fruits);

        Map<String, Integer> fruitsMap = new HashMap<>();
        fruitsMap.put("Mango", 100);
        fruitsMap.put("Guava", 70);
        fruitsMap.put("Grapes", 40);
        fruitsMap.put("Apple", 60);
        fruitsMap.put("Banana", 30);

        Map<String, Integer> sortedByKeyAsc = fruitsMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        Map<String, Integer> sortedByValueDsc = fruitsMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        System.out.println(sortedByKeyAsc);
        System.out.println(sortedByValueDsc);
    }
}
