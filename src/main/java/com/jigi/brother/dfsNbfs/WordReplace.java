package com.jigi.brother.dfsNbfs;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordReplace {

    public int solution(String begin, String target, String[] words) {

        int n = words.length;
        String[] temp = Arrays.copyOf(words, n + 1);
        temp[n] = begin;

        HashMap<String, HashSet<String>> nodeMap = new HashMap<>();

        for (String word : temp) {
            HashSet<String> wordSet = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                String regexp = word.substring(0, i) + "." + word.substring(i + 1);
                if (nodeMap.get(word) != null) {
                    wordSet = nodeMap.get(word);
                }
                getHashSet(temp, regexp, wordSet);
            }
            nodeMap.put(word, wordSet);
        }

        return dijkstra(nodeMap, begin, target);
    }


    private void getHashSet(String[] words, String regexp, HashSet<String> wordSet) {
        Pattern pattern = Pattern.compile(regexp);
        for (String word : words) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                wordSet.add(word);
            }
        }
    }

    private int dijkstra(HashMap<String, HashSet<String>> nodeMap, String startNode, String targetNode) {

        int n = nodeMap.size();
        HashMap<String, Boolean> visited = new HashMap<>();
        HashMap<String, Integer> distance = new HashMap<>();

        for (String node : nodeMap.keySet()) {
            visited.put(node, false);
            distance.put(node, Integer.MAX_VALUE);
        }

        visited.put(startNode, true);
        distance.put(startNode, 0);

        for (String node : nodeMap.get(startNode)) {
            if (!visited.get(node)) {
                distance.put(node, 1);
            }
        }

        StringBuffer path = new StringBuffer("노드 이동경로 : ").append(startNode);

        for (int i = 1; i <= n - 1; i++) {

            int min = Integer.MAX_VALUE;
            String minIndex = "";

            // 방문한 적이 없고, 연결된 노드 중 가장 가까운 거리에 있는 노드 구하기
            for (String node : visited.keySet()) {
                if (!visited.get(node) && distance.get(node) != Integer.MAX_VALUE) {
                    if (distance.get(node) < min) {
                        min = distance.get(node);
                        minIndex = node;
                    }
                }
            }

            // 연결된 노드를 찾지 못하면 건너뜀 
            if (visited.get(minIndex) == null) continue;

            visited.put(minIndex, true);
            path.append(", ").append(minIndex);

            for (String linkedNode : nodeMap.get(minIndex)) {
                if (!visited.get(linkedNode)) {
                    if (distance.get(linkedNode) > distance.get(minIndex) + 1) {
                        distance.put(linkedNode, distance.get(minIndex) + 1);
                    }
                }
            }
        }

        System.out.println(path);

        for (String node : distance.keySet()) {
            System.out.print(node + "(" + distance.get(node) + "), ");
        }

        return distance.get(targetNode) == null ? 0 : distance.get(targetNode);
    }

}
