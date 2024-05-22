package ru.ls.qa.school.core;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        double x = 5.0;
        double y = 6.0;
        return Math.sqrt(Math.pow(this.y - this.x, 2) + Math.pow(y - x, 2));
    }
}
