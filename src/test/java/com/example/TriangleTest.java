package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testScalene() {
        Triangle t = new Triangle(3, 4, 5);
        assertEquals("Scalene", t.getTriangleType());
    }

    @Test
    public void testEquilateral() {
        Triangle t = new Triangle(3, 3, 3);
        assertEquals("Equilateral", t.getTriangleType());
    }    

    @Test
    public void testIsoceles() {
        Triangle t1 = new Triangle(3, 3, 5);
        assertEquals("Isosceles", t1.getTriangleType());
    }

    @Test
    public void testNotTriangle1() {
        Triangle t = new Triangle(1, 2, 3);
        assertEquals("Not a triangle", t.getTriangleType());
    }

    @Test
    public void sidesShouldBePositive() {
        Triangle t = new Triangle(-1, 2, 3);
        assertEquals("Not a triangle", t.getTriangleType());
    }
}
