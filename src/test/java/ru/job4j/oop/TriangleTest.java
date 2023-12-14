package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;


class TriangleTest {

    @Test
    void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isCloseTo(expected, offset(0.01));
    }

    @Test
    void when20and40and02Then2() {
        Point a = new Point(2, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 2);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 2;
        assertThat(result).isCloseTo(expected, offset(0.01));
    }

    @Test
    void when00and22and55ThenMinus1() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);
        Point c = new Point(5, 5);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        assertThat(result).isCloseTo(expected, offset(0.01));
    }
}