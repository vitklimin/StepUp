package ru.сourses.main;

import ru.courses.lines.*;

public class Main {
    public static void main(String[] args) {
        PolyLine polyLine1 = new PolyLine(new Point(1, 2), new Point(4, 5), new Point(1, 5));
        PolyLine polyLine2 = new PolyLine(new Point(1, 2), new Point(4, 5), new Point(1, 5));
        PolyLine polyLine3 = new PolyLine(new Point(2, 2), new Point(2, 5), new Point(4, 5));
        System.out.println("polyLine1: " + polyLine1);
        System.out.println("polyLine2: " + polyLine2);
        System.out.println("polyLine3: " + polyLine3);
        System.out.println("polyLine1 == polyLine2: " + polyLine1.equals(polyLine2));
        System.out.println("polyLine1 == polyLine3: " + polyLine1.equals(polyLine3));
        System.out.println("polyLine2 == polyLine3: " + polyLine2.equals(polyLine3));
    }
}