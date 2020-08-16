package com.jigi.brother.array;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class PassedRoad {

    public int solution(String dirs) {

        Point currentPoint = new Point(5, 5);
        Set<Path> visitedPath = new HashSet<>();
        for (char direction : dirs.toCharArray()) {
            Path path = movePoint(currentPoint, direction);
            if (path.isMoving()) visitedPath.add(path);
        }

        return visitedPath.size();
    }

    private Path movePoint(Point currentPoint, char direction) {
        Point sourcePoint = new Point(currentPoint.x, currentPoint.y);
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

        if (currentPoint.x + x >= 0 && currentPoint.x + x <= 10) {
            currentPoint.x += x;
        }

        if (currentPoint.y + y >= 0 && currentPoint.y + y <= 10) {
            currentPoint.y += y;
        }

        return new Path(sourcePoint, new Point(currentPoint.x, currentPoint.y));
    }

    private class Path {
        private Point source;
        private Point destination;

        public Path(Point source, Point destination) {
            this.source = source;
            this.destination = destination;
        }

        public boolean isMoving() {
            if (source.x != destination.x || source.y != destination.y) return true;
            return false;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) return false;
            if (obj == this) return true;
            if (obj.getClass() != this.getClass()) return false;

            Path that = (Path) obj;

            if (this.source != null && that.source == null || this.source == null && that.source != null) return false;
            if (this.destination != null && that.destination == null || this.destination == null && that.destination != null)
                return false;

            if (this.hashCode() == that.hashCode()) {
                return true;
            }

            return false;
        }

        @Override
        public int hashCode() {

            final int prime = 31;
            int hashCode = 1;

            hashCode = prime * hashCode + (source.x + destination.x);
            hashCode = prime * hashCode + (source.y + destination.y);

            return hashCode;
        }
    }
}
