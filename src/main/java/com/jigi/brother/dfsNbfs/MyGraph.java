package com.jigi.brother.dfsNbfs;

import javafx.util.Pair;

import java.util.*;

public class MyGraph {

    /**
     * DFS 인접리스트 : 깊이우선탐색
     *
     * @param nodeList : 각 노드에 연결된 노드 리스트를 갖는 배열
     * @param visited  : 방문여부 확인을 위한 배열
     * @param node     : 방문할 노드
     */
    public static void dfs(ArrayList<Integer>[] nodeList, boolean[] visited, int node) {
        if (visited[node]) return; // 방문한 노드인 경우 바로 종료

        visited[node] = true;           // 방문한 노드로 표기

        // 여기에 필요한 결과값을 리턴하도록 코딩하면 됨
        System.out.print(node + " ");   // 방문한 노드 화면출력

        for (int nextNode : nodeList[node]) {  // 노드에 연결된 모든 노드를 방문한다.
            dfs(nodeList, visited, nextNode);
        }
    }

    /**
     * DFS 인접행렬 : 깊이우선탐색
     *
     * @param nodeArray : 각 노드를 행/렬로 하고, 연결된 노드는 1로 표기하는 2차원 배열
     * @param visited   : 방문여부 확인을 위한 배열
     * @param node:     : 방문할 노드
     */
    public static void dfs(int[][] nodeArray, boolean[] visited, int node) {
        if (visited[node]) return;      // 방문한 노드인 경우 바로 종료

        visited[node] = true;           // 방문한 노드로 표기

        // 여기에 필요한 결과값을 리턴하도록 코딩하면 됨
        System.out.print(node + " ");   // 방문한 노드 화면출력

        for (int i = 1; i < nodeArray.length; i++) {
            if (nodeArray[node][i] == 1) {
                dfs(nodeArray, visited, i);
            }
        }
    }

    /**
     * BFS 인접리스트 : 너비우선탐색
     *
     * @param nodeList : 각 노드에 연결된 노드 리스트를 갖는 배열
     * @param visited  : 방문여부 확인을 위한 배열
     * @param node     : 노드
     */
    public static void bfs(ArrayList<Integer>[] nodeList, boolean[] visited, int node) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(node);      // 큐에 루트 노드를 넣는다.

        while (!queue.isEmpty()) {
            node = queue.poll();               // 큐에 들어간 노드들을 꺼낸다.

            if (visited[node]) continue;        // 이미 방문한 노드는 건너뜀

            // 여기에 필요한 결과값을 리턴하도록 코딩하면 됨
            System.out.print(node + " ");       // 방문한 노드를 화면에 표기한다.

            visited[node] = true;               // 방문한 노드를 배열에 저장

            for (int nextNode : nodeList[node]) {
                queue.add(nextNode);
            }
        }
    }

    /**
     * BFS 인접행렬 : 너비우선탐색
     *
     * @param nodeArray : 각 노드를 행/렬로 하고, 연결된 노드는 1로 표기하는 2차원 배열
     * @param visited   : 방문여부 확인을 위한 배열
     * @param node:     : 방문할 노드
     */
    public static void bfs(int[][] nodeArray, boolean[] visited, int node) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(node);      // 큐에 루트 노드를 넣는다.

        while (!queue.isEmpty()) {
            node = queue.poll();               // 큐에 들어간 노드들을 꺼낸다.

            if (visited[node]) continue;        // 이미 방문한 노드는 건너뜀

            // 여기에 필요한 결과값을 리턴하도록 코딩하면 됨
            System.out.print(node + " ");       // 방문한 노드를 화면에 표기한다.

            visited[node] = true;               // 방문한 노드를 배열에 저장

            for (int i = 1; i < nodeArray.length; i++) {
                if (nodeArray[node][i] == 1) {
                    queue.add(i);
                }
            }
        }
    }


    /**
     * 다익스트라 알고리즘(인접행렬) : 시작노드로부터 각 노드로의 최단거리값을 반환한다.
     *
     * @param nodeArray : 각 노드를 행/렬로 하고 연결된 노드는 0 이상의 숫자로 표기하는 2차원 배열, 인덱스는 1부터 사용한다.
     *                  숫자가 클 수록 거리가 멀다. 0인 경우 노드는 연결되지 않음
     * @param startNode : 최초 시작노드(정점)
     */
    public static void dijkstra(int[][] nodeArray, int startNode) {

        int n = nodeArray.length - 1;   // 노드(정점)의 개수
        boolean[] visited = new boolean[n + 1];
        int[] distance = new int[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE); // 최단거리 계산을 위해 매우 큰값(연산된 최대값보다도 훨씬 큰 값)으로 초기화

        // 최초 시작 노드값 세팅(방문처리)
        visited[startNode] = true;
        distance[startNode] = 0;

        // 최초 시작노드와 연결된 노드에 가중치(거리) 할당
        for (int i = 1; i <= n; i++) {
            if (nodeArray[startNode][i] != 0 && !visited[i]) {
                distance[i] = nodeArray[startNode][i];
            }
        }

        StringBuffer path = new StringBuffer("노드 이동경로 : ").append(startNode);

        // visited가 모두 true가 될 때까지 반복해야 하며, 최초노드는 방문했으므로 1회를 뺀다.
        for (int i = 1; i <= n - 1; i++) {

            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            // 방문한 적이 없고, 연결된 노드 중 가장 가까운 거리에 있는 노드 구하기
            for (int j = 1; j <= n; j++) {
                if (!visited[j] && distance[j] != Integer.MAX_VALUE) {
                    if (distance[j] < min) {
                        min = distance[j];
                        minIndex = j;
                    }
                }
            }

            visited[minIndex] = true; // 위에서 구해진 (가장 가까운 거리에 있는) 노드를 방문처리
            path.append(", ").append(minIndex); // 노드 이동경로 확인

            // 현재 노드(위에서 구해진 노드, minIndex)에 연결된 미방문 노드(k)의 기존 최단거리 distance[k]와
            // 현재 노드(minIndex)에서 해당 노드(k)를 방문할 때 걸리는 거리값(distance[minIndex] + nodeArray[minIndex][k])을 비교하여
            // 기존 최단거리 distance[k] 값을 더 짧은 값으로 갱신한다.
            for (int k = 1; k <= n; k++) {
                if (!visited[k] && nodeArray[minIndex][k] != 0) {
                    if (distance[k] > distance[minIndex] + nodeArray[minIndex][k]) {
                        distance[k] = distance[minIndex] + nodeArray[minIndex][k];
                    }
                }
            }
        }

        // 노드이동경로 출력
        System.out.println(path);

        // 결과출력
        for (int i = 1; i <= n; i++) {
            System.out.print(distance[i] + ", ");
        }
    }

    /**
     * 다익스트라 알고리즘(인접리스트) : 시작노드로부터 각 노드로의 최단거리값을 반환한다.
     *
     * @param nodeList  : 각 노드에 연결된 리스트를 같는 1차원 배열, 인덱스는 1부터 사용한다. 노드간의 거리는 숫자로 표현, 숫자가 클 수록 거리가 멀다
     * @param startNode : 최초 시작노드(정점)
     */
    public static void dijkstra(ArrayList<Pair<Integer, Integer>>[] nodeList, int startNode) {

        int n = nodeList.length - 1;   // 노드(정점)의 개수
        boolean[] visited = new boolean[n + 1];
        int[] distance = new int[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE); // 최단거리 계산을 위해 매우 큰값(연산된 최대값보다도 훨씬 큰 값)으로 초기화

        // 최초 시작 노드값 세팅(방문처리)
        visited[startNode] = true;
        distance[startNode] = 0;

        // 최초 시작노드와 연결된 노드에 가중치(거리) 할당
        for (Pair<Integer, Integer> pair : nodeList[startNode]) {
            int node = pair.getKey();
            int weight = pair.getValue();

            if (!visited[node]) {
                distance[node] = weight;
            }
        }

        StringBuffer path = new StringBuffer("노드 이동경로 : ").append(startNode);

        // visited가 모두 true가 될 때까지 반복해야 하며, 최초노드는 방문했으므로 1회를 뺀다.
        for (int i = 1; i <= n - 1; i++) {

            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            // 방문한 적이 없고, 연결된 노드 중 가장 가까운 거리에 있는 노드 구하기
            for (int j = 1; j <= n; j++) {
                if (!visited[j] && distance[j] != Integer.MAX_VALUE) {
                    if (distance[j] < min) {
                        min = distance[j];
                        minIndex = j;
                    }
                }
            }

            visited[minIndex] = true; // 위에서 구해진 (가장 가까운 거리에 있는) 노드를 방문처리
            path.append(", ").append(minIndex); // 노드 이동경로 확인

            // 현재 노드(위에서 구해진 노드, minIndex)에 연결된 미방문 노드(k)의 기존 최단거리 distance[k]와
            // 현재 노드(minIndex)에서 해당 노드(k)를 방문할 때 걸리는 거리값(distance[minIndex] + nodeArray[minIndex][k])을 비교하여
            // 기존 최단거리 distance[k] 값을 더 짧은 값으로 갱신한다.
            for (Pair<Integer, Integer> pair : nodeList[minIndex]) {
                int node = pair.getKey();
                int weight = pair.getValue();
                if (!visited[node]) {
                    if (distance[node] > distance[minIndex] + weight) {
                        distance[node] = distance[minIndex] + weight;
                    }
                }
            }
        }

        // 노드이동경로 출력
        System.out.println(path);

        // 결과출력
        for (int i = 1; i <= n; i++) {
            System.out.print(distance[i] + ", ");
        }
    }


    /**
     * 다익스트라 알고리즘(인접 해쉬맵-해쉬셋) : 시작노드로부터 각 노드로의 최단거리값을 반환한다.
     *
     * @param nodeMap   : (문자열로 된) 노드에 연결 된 노드리스트를 해시셋으로 가진 해쉬맵 구조
     *                  문자열에는 중복이 없다고 가정,
     *                  간선(노드 간 연결)에는 가중치가 모두 1로 동일하다는 가정
     * @param startNode : 시작노드
     */
    public static void dijkstra(HashMap<String, HashSet<String>> nodeMap, String startNode) {

        int n = nodeMap.size();   // 노드(정점)의 개수
        HashMap<String, Boolean> visited = new HashMap<>();     // 노드 방문여부 검사
        HashMap<String, Integer> distance = new HashMap<>();    // 노드간 연결(간선) 거리(가중치), 여기서는 모두 1로 가정한다.

        for (String node : nodeMap.keySet()) {
            visited.put(node, false);           // 방문 여부 확인을 위해 미방문으로 모두 초기화
            distance.put(node, Integer.MAX_VALUE); // 최단거리 계산을 위해 매우 큰값(연산된 최대값보다도 훨씬 큰 값)으로 초기화
        }

        visited.put(startNode, true);  // 시작 노드값 세팅(방문처리)
        distance.put(startNode, 0);    // 시작노드에서 시작노드까지의 거리는 0이다

        // 최초 시작노드와 연결된 노드에 가중치(거리) 할당
        for (String node : nodeMap.get(startNode)) {
            if (!visited.get(node)) {
                distance.put(node, 1); // 여기서는 가중치가 모두 동일하게 1로 세팅
            }
        }

        StringBuffer path = new StringBuffer("노드 이동경로 : ").append(startNode);

        // visited가 모두 true가 될 때까지 반복해야 하며, 최초 시작노드는 방문했으므로 1회를 뺀다.
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

            visited.put(minIndex, true); // 위에서 구해진 (가장 가까운 거리에 있는) 노드를 방문처리
            path.append(", ").append(minIndex); // 노드 이동경로 확인

            // 현재 노드(위에서 구해진 노드, minIndex)에 연결된 미방문 노드(k)의 기존 최단거리 distance[k]와
            // 현재 노드(minIndex)에서 해당 노드(k)를 방문할 때 걸리는 거리값(distance[minIndex] + nodeArray[minIndex][k])을 비교하여
            // 기존 최단거리 distance[k] 값을 더 짧은 값으로 갱신한다.
            for (String linkedNode : nodeMap.get(minIndex)) {
                if (!visited.get(linkedNode)) {
                    if (distance.get(linkedNode) > distance.get(minIndex) + 1) { // 모든 간선의 거리(가중치)는 1로 계산
                        distance.put(linkedNode, distance.get(minIndex) + 1);
                    }
                }
            }
        }

        // 노드이동경로 출력
        System.out.println(path);

        // 결과출력
        for (String node : distance.keySet()) {
            System.out.print(node + "(" + distance.get(node) + "), ");
        }
    }
}
