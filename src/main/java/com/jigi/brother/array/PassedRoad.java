package com.jigi.brother.array;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class PassedRoad {
    private final Set<String> passedRoad = new HashSet<>();
    private final Point currentLocation = new Point(5, 5);

    public int solution(String dirs) {

        for (char direction : dirs.toCharArray()) {
            move(currentLocation, direction);
        }

        return passedRoad.size();
    }

    private void move(Point location, char direction) {
        switch (direction) {
            case 'U':
                goingUp(location);
                break;
            case 'D':
                goingDown(location);
                break;
            case 'L':
                goingLeft(location);
                break;
            case 'R':
                goingRight(location);
                break;
        }
    }

    private void goingUp(Point destination) {
        Point source = new Point(destination.x, destination.y);
        if (source.x > 0) {
            destination.x--;
        }
        addPath(source, destination);
    }

    private void goingDown(Point destination) {
        Point source = new Point(destination.x, destination.y);
        if (source.x < 10) {
            destination.x++;
        }
        addPath(source, destination);
    }

    private void goingLeft(Point destination) {
        Point source = new Point(destination.x, destination.y);
        if (source.y > 0) {
            destination.y--;
        }
        addPath(source, destination);
    }

    private void goingRight(Point destination) {
        Point source = new Point(destination.x, destination.y);
        if (source.y < 10) {
            destination.y++;
        }
        addPath(source, destination);
    }

    private void addPath(Point source, Point destination) {
        if (source.x != destination.x || source.y != destination.y) {
            String sourcePath = "" + source.x + source.y;
            String destinationPath = "" + destination.x + destination.y;
            String newPath = sourcePath.compareTo(destinationPath) == -1 ? sourcePath + destinationPath : destinationPath + sourcePath;
            passedRoad.add(newPath);
        }
    }
}
