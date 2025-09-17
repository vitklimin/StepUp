package ru.courses.lines;

import java.util.Arrays;
import java.util.Objects;

public class PolyLine {
    private Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    public double length() {
        double sum = 0, len1, len2;
        for (int i = 0; i < points.length - 1; i++) {
            len1 = points[i].getX() - points[i + 1].getX();
            len2 = points[i].getY() - points[i + 1].getY();
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }

        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolyLine polyLine = (PolyLine) o;
        return Objects.deepEquals(points, polyLine.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }

    @Override
    public String toString() {
        return "ru.courses.lines.PolyLine[" +
                "points=" + Arrays.toString(points) +
                ']';
    }
}