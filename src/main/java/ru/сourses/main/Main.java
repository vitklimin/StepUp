package ru.сourses.main;

import ru.courses.geometry.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point1 = new Point(6, 8);
        Point point2 = new Point(6,7);
        System.out.println("point1 == point2: " + point1.equals(point2));
        Point point3 = point1.clone();
        System.out.println("point1 == point3: " + point1.equals(point3));
    }
}