package ru.courses.lines;

import java.util.Objects;

public class Line implements Cloneable {
    private Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(start.getX(), line.start.getX())
                && Objects.equals(start.getY(), line.start.getY())
                && Objects.equals(end.getX(), line.end.getX())
                && Objects.equals(end.getY(), line.end.getY());
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        Line tmp = (Line) super.clone();
        tmp.start = start.clone();
        tmp.end = end.clone();

        return tmp;
    }

    @Override
    public String toString() {
        return "ru.courses.lines.Line[" +
                "start=" + start +
                ",end=" + end +
                ']';
    }
}