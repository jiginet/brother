package com.jigi.brother.dfsNbfs;

/**
 * 네트워크
 * https://programmers.co.kr/learn/courses/30/lessons/43162
 */
public class Network {

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == true) continue;
            int[] count = {0};
            dfs(computers, visited, i, count);
            if (count[0] == n) {
                answer = 1;
                break;
            }
            answer++;
        }
        return answer;
    }

    private void dfs(int[][] nodes, boolean[] visited, int node, int[] count) {
        if (visited[node]) return;
        visited[node] = true;
        count[0]++;
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[node][i] == 1 && node != i) {
                dfs(nodes, visited, i, count);
            }
        }
    }


    public int solution2(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        boolean[] check = {false};
        for (int i = 0; i < n; i++) {
            check[0] = false;
            dfs2(computers, visited, i, check);
            if (check[0]) answer++;
        }
        return answer;
    }

    private void dfs2(int[][] nodeArray, boolean[] visited, int node, boolean[] check) {
        if (visited[node]) return;      // 방문한 노드인 경우 바로 종료

        visited[node] = true;           // 방문한 노드로 표기

        // 여기에 필요한 결과값을 리턴하도록 코딩하면 됨
        System.out.print(node + " ");   // 방문한 노드 화면출력
        check[0] = true;

        for (int i = 0; i < nodeArray.length; i++) {
            if (nodeArray[node][i] == 1 && node != i) {
                dfs2(nodeArray, visited, i, check);
            }
        }
    }
}
