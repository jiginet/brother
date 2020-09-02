package com.jigi.brother.array;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PassedRoad {

    private class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point movePoint(char direction) {
            int x = 0, y = 0;
            switch (direction) {
                case 'U':
                    x = -1;
                    break;
                case 'D':
                    x = 1;
                    break;
                case 'L':
                    y = -1;
                    break;
                case 'R':
                    y = 1;
                    break;
            }

            int nextX = this.x;
            if (this.x + x >= 0 && this.x + x <= 10) {
                nextX += x;
            }

            int nextY = this.y;
            if (this.y + y >= 0 && this.y + y <= 10) {
                nextY += y;
            }

            return new Point(nextX, nextY);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    private class Path {
        private final Point source;
        private final Point destination;

        public Path(Point source, Point destination) {
            this.source = source;
            this.destination = destination;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Path path = (Path) o;
            return this.hashCode() == path.hashCode();
        }

        @Override
        public int hashCode() {
            return source.hashCode() + destination.hashCode();
        }
    }

    public int solution(String dirs) {

        Point currentPoint = new Point(5, 5);
        Set<Path> visitedPath = new HashSet<>();
        for (char direction : dirs.toCharArray()) {
            Point nextPoint = currentPoint.movePoint(direction);
            if (!currentPoint.equals(nextPoint)) visitedPath.add(new Path(currentPoint, nextPoint));
            currentPoint = nextPoint;
        }

        return visitedPath.size();
    }
}
