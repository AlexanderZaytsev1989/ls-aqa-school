package ru.ls.qa.school.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void pointDistance() {
        Point p = new Point(5.0, 5.0);

        double expected = 1.0;
        double actual = p.distance(p);

        assertEquals(expected, actual);
    }




}