package com.jigi.brother.dfsNbfs;

import javafx.util.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MyGraphTest {

    MyGraph graph = new MyGraph();

    // 인접행렬
    int[][] array;

    // 인접리스트
    ArrayList<Integer>[] list;

    ArrayList<Pair<Integer, Integer>>[] weightList;

    // 노드명이 문자열인 해시맵 구조
    HashMap<String, HashSet<String>> map = new HashMap<>();

    // 노드(정점)을 방문여부를 검사하기 위한 배열
    boolean[] visited;

    @BeforeEach
    void setUp() {

        /* 아래와 같이 그래프가 주어진 경우

           예)   ┌  ①  ┐
               ┌ ② ┐   ③ ┐
              ④    ⑤     ⑥

          노드 수 : n = 6
          간선 수 : m = 5
          시작 노드 : ①

          ㅇ 인접행렬로 표기 (각 행/열은 노드를 의미, 노드가 만나는 곳의 값이 1인 경우 간선이 연결
             - 공간복잡도 : n * n =  n ^ 2
              ①   ②   ③   ④   ⑤   ⑥
          ①   0    1    1    0    0    0
          ②   1    0    0    1    1    0
          ③   1    0    0    0    0    1
          ④   0    1    0    0    0    0
          ⑤   0    1    0    0    0    0
          ⑥   0    0    1    0    0    0

          ㅇ 인접리스트로 표기 (각 노드에 간선으로 연결된 노드들을 리스트로 갖고 있다)
            - 공간복잡도 : n + m
            ① : ②, ③
            ② : ①, ④, ⑤
            ③ : ①, ⑥
            ④ : ②
            ⑤ : ②
            ⑥ : ③
         */

        // 노드의 개수
        int n = 6;

        // 인접행렬(각 행렬의 0번 index는 사용하지 않음)
        array = new int[n + 1][n + 1];
        //array[0] = new int[]{-1, -1, -1, -1, -1, -1, -1};
        array[1] = new int[]{-1, 0, 1, 1, 0, 0, 0};
        array[2] = new int[]{-1, 1, 0, 0, 1, 1, 0};
        array[3] = new int[]{-1, 1, 0, 0, 0, 0, 1};
        array[4] = new int[]{-1, 0, 1, 0, 0, 0, 0};
        array[5] = new int[]{-1, 0, 1, 0, 0, 0, 0};
        array[6] = new int[]{-1, 0, 0, 1, 0, 0, 0};

        // 인접리스트(0번 index는 사용하지 않음)
        list = new ArrayList[n + 1];
        list[1] = new ArrayList<Integer>() {
            {
                add(2);
                add(3);
            }
        };

        list[2] = new ArrayList<Integer>() {
            {
                add(1);
                add(4);
                add(5);
            }
        };

        list[3] = new ArrayList<Integer>() {
            {
                add(1);
                add(6);
            }
        };

        list[4] = new ArrayList<Integer>() {
            {
                add(2);
            }
        };

        list[5] = new ArrayList<Integer>() {
            {
                add(2);
            }
        };

        list[6] = new ArrayList<Integer>() {
            {
                add(3);
            }
        };

        visited = new boolean[n + 1];

        // 가중치가 있는 인접리스트(최단 거리 구하기에 주로 이용)
        //            예)   ┌  ①  ┐
        //               ┌ ②  ┐   ③ ┐
        //              ④    ⑤     ⑥

        weightList = new ArrayList[n + 1];

        // 여기에서는 가중치를 모두 1로 계산하였다. 필요시 Pair 2번째 인자값을 변경한다.
        weightList[1] = new ArrayList<Pair<Integer, Integer>>() {
            {
                add(new Pair<>(2, 1));
                add(new Pair<>(3, 1));
            }
        };

        weightList[2] = new ArrayList<Pair<Integer, Integer>>() {
            {
                add(new Pair<>(1, 1));
                add(new Pair<>(4, 1));
                add(new Pair<>(5, 1));
            }
        };

        weightList[3] = new ArrayList<Pair<Integer, Integer>>() {
            {
                add(new Pair<>(1, 1));
                add(new Pair<>(6, 1));
            }
        };

        weightList[4] = new ArrayList<Pair<Integer, Integer>>() {
            {
                add(new Pair<>(2, 1));
            }
        };

        weightList[5] = new ArrayList<Pair<Integer, Integer>>() {
            {
                add(new Pair<>(2, 1));
            }
        };

        weightList[6] = new ArrayList<Pair<Integer, Integer>>() {
            {
                add(new Pair<>(3, 1));
            }
        };

        // 가중치가 모두 1로 동일한 해시맵 구조(최단 거리 구하기에 주로 이용)
        //            예)   ┌  ①  ┐
        //               ┌ ②  ┐   ③ ┐
        //              ④    ⑤     ⑥
        map.put("1", new HashSet<String>() {
                    {
                        add("2");
                        add("3");
                    }
                }
        );

        map.put("2", new HashSet<String>() {
                    {
                        add("1");
                        add("4");
                        add("5");
                    }
                }
        );

        map.put("3", new HashSet<String>() {
                    {
                        add("1");
                        add("6");
                    }
                }
        );

        map.put("4", new HashSet<String>() {
                    {
                        add("2");
                        add("3");
                    }
                }
        );

        map.put("5", new HashSet<String>() {
                    {
                        add("2");
                    }
                }
        );

        map.put("6", new HashSet<String>() {
                    {
                        add("3");
                    }
                }
        );
    }

    @Test
    void dfsTest() {
        graph.dfs(list, visited, 1);

        // 방문여부 다시 초기화
        for (int i = 1; i < visited.length; i++) {
            visited[i] = false;
        }
        System.out.println();

        graph.dfs(array, visited, 1);
    }

    @Test
    void bfsTest() {
        graph.bfs(list, visited, 1);

        // 방문여부 다시 초기화
        for (int i = 1; i < visited.length; i++) {
            visited[i] = false;
        }
        System.out.println();

        graph.bfs(array, visited, 1);
    }

    @Test
    void digkstraTest() {

        // 입력값이 2차원 배열인 경우
        graph.dijkstra(array, 1);

        System.out.println();

        // 입력값이 1차원 리스트 배열인 경우
        graph.dijkstra(weightList, 1);


        System.out.println();

        // 노드명이 문자열인 해쉬맵 구조
        graph.dijkstra(map, "1");

    }
}
