package com.jigi.brother.array;

import java.util.*;
import java.util.stream.Collectors;

public class ColoringBook {


    class Area {
        int color;
        int x;
        int y;

        public Area(int color, int x, int y) {
            this.color = color;
            this.x = x;
            this.y = y;
        }
    }

    /**
     * 내가 푼 방식
     *
     * @param m
     * @param n
     * @param picture
     * @return
     */
    public int[] solution(int m, int n, int[][] picture) {

        List<Area> areaList = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] != 0) {
                    areaList.add(new Area(picture[i][j], i, j));
                }
            }
        }

        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        while (areaList.size() != 0) {

            Area area = areaList.get(0);
            areaList.remove(area);

            Stack<Area> stack = new Stack<>();
            stack.push(area);

            int count = 0;
            while (!stack.isEmpty()) {
                Area current = stack.pop();
                count++;
                List<Area> matchedAreas = areaList.stream()
                        .filter(a -> a.color == current.color && ((a.x == current.x && Math.abs(a.y - current.y) == 1) || (a.y == current.y && Math.abs(a.x - current.x) == 1)))
                        .collect(Collectors.toList());
                for (Area a : matchedAreas) {
                    stack.push(a);
                }
                areaList.removeIf(a -> a.color == current.color && ((a.x == current.x && Math.abs(a.y - current.y) == 1) || (a.y == current.y && Math.abs(a.x - current.x) == 1)));
            }
            numberOfArea++;
            if (count > maxSizeOfOneArea) maxSizeOfOneArea = count;
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }


    class Node {
        int x;
        int y;
        int color;

        Node(int x, int y, int color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }
    }

    /**
     * 다른사람이 푼 방식, 나보다 성능이 빠를 것으로 추측(  for 문이 ArrayList 연산보다 빠르므로)
     *
     * @param m
     * @param n
     * @param picture
     * @return
     */
    public int[] solution2(int m, int n, int[][] picture) {
        int maxSizeOfOneArea = 0;
        boolean[][] visited = new boolean[m][n];
        int[][] offsets = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int areaId = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j]) {
                    continue;
                }

                // do nothing for uncolored blocks
                int thisColor = picture[i][j];
                if (thisColor == 0) {
                    visited[i][j] = true;
                    continue;
                }

                // conduct a bfs
                Queue<Node> queue = new LinkedList<Node>();
                queue.add(new Node(i, j, thisColor)); // root
                visited[i][j] = true;
                int thisAreaSize = 0;
                areaId++;

                while (!queue.isEmpty()) {
                    Node currNode = queue.poll();
                    thisAreaSize++;

                    // add adjacent blocks
                    for (int[] offset : offsets) {
                        int sideX = currNode.x + offset[0];
                        int sideY = currNode.y + offset[1];
                        if (sideX >= 0 && sideY >= 0 && sideX < m && sideY < n) {
                            int thatColor = picture[sideX][sideY];
                            if (!visited[sideX][sideY] && thatColor == thisColor) {
                                queue.add(new Node(sideX, sideY, thatColor));
                                visited[sideX][sideY] = true;
                            }
                        }
                    }
                }

                // update max area size
                if (maxSizeOfOneArea < thisAreaSize) {
                    maxSizeOfOneArea = thisAreaSize;
                }
            }
        }

        // compose the answer
        int[] answer = new int[2];
        answer[0] = areaId;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
}
