package com.athul.dsa.vector.sortmarks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class SortMarks {
    public static void main(String[] args) {
        List<Map<String, List<Integer>>> marks = new ArrayList<>();
        marks.add(Map.of("Rohan", List.of(80, 90, 85)));
        marks.add(Map.of("Prateek", List.of(70, 60, 80)));
        marks.add(Map.of("Vivek", List.of(50, 45, 55)));
        marks.add(Map.of("Rachel", List.of(90, 100, 95)));

        //new list
        List<Map<String, List<Integer>>> sorted = marks.stream()
                .sorted(Comparator.comparingInt((Map<String, List<Integer>> entry) ->
                        entry.values().iterator().next().stream().mapToInt(Integer::intValue).sum()
                ).reversed())
                .toList();

        //in place
        marks.sort(Comparator.comparingInt((Map<String, List<Integer>> entry) ->
                entry.values().iterator().next()
                        .stream()
                        .mapToInt(Integer::intValue)
                        .sum())
                .reversed());

        //custom comparator
        marks.sort((map1, map2) -> {
            int totalMarks1 = calculateTotalMarks(map1);
            int totalMarks2 = calculateTotalMarks(map2);
            return Integer.compare(totalMarks2, totalMarks1);
        });

        System.out.println(sorted);
        System.out.println(marks);
    }

    private static int calculateTotalMarks(Map<String, List<Integer>> entry) {
        List<Integer> marksList = entry.values().iterator().next();
        return marksList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
