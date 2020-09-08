package com.jigi.brother.dfsNbfs;

import java.util.LinkedList;
import java.util.Queue;

public class GameMap {

    private class Node {
        private final int x;
        private final int y;
        private final int distance;

        public Node(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getDistance() {
            return distance;
        }
    }

    public int solution(int[][] maps) {

        final int mapHeight = maps.length;
        final int mapWidth = maps[0].length;
        boolean[][] visited = new boolean[mapHeight][mapWidth];

        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0, 0, 1));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            for (int i = getBeginPoint(node.getX()); i < getEndPoint(node.getX(), mapHeight); i++) {
                for (int j = getBeginPoint(node.getY()); j < getEndPoint(node.getY(), mapWidth); j++) {
                    if (visited[i][j] || maps[i][j] != 1 || !canMove(node, i, j)) continue;
                    visited[i][j] = true;
                    queue.offer(new Node(i, j, node.getDistance() + 1));
                    if (i == mapHeight - 1 && j == mapWidth - 1) return node.getDistance() + 1;
                }
            }
        }
        return -1;
    }

    private int getBeginPoint(int point) {
        return point - 1 <= 0 ? 0 : point - 1;
    }

    private int getEndPoint(int point, int maxPoint) {
        return point + 2 >= maxPoint ? maxPoint : point + 2;
    }

    private boolean canMove(Node node, int x, int y) {
        return (Math.abs(node.getX() - x) == 1 && node.getY() == y)
                || (Math.abs(node.getY() - y) == 1 && node.getX() == x);
    }
}
