package ru.ls.qa.school.core;

public class PointTask {
    public static void main(String[] args) {
        Point a = new Point(-1.0, 3.0);
        Point b = new Point(2.0, -1.0);
        System.out.println(a.distance(b));
        System.out.println(b.distance(a));
        System.out.println(a.distance(a));
        System.out.println(b.distance(b));
    }
}
