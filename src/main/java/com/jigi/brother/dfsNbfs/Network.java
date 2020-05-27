package com.jigi.brother.dfsNbfs;

public class Network {

    boolean check = false;

    public int solution(int n, int[][] computers) {
        int answer = 0;

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            check = false;
            dfs(computers, visited, i);
            if (check) answer++;
        }

        return answer;
    }

    private void dfs(int[][] nodeArray, boolean[] visited, int node) {
        if (visited[node]) return;      // 방문한 노드인 경우 바로 종료

        visited[node] = true;           // 방문한 노드로 표기

        // 여기에 필요한 결과값을 리턴하도록 코딩하면 됨
        System.out.print(node + " ");   // 방문한 노드 화면출력
        check = true;

        for (int i = 0; i < nodeArray.length; i++) {
            if (nodeArray[node][i] == 1 && node != i) {
                dfs(nodeArray, visited, i);
            }
        }
    }
}
