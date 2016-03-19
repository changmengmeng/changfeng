package STlab1JunitTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    private MyTriangle tri;
    
    @Test
    public void test(){
        tri = new MyTriangle();
        assertEquals("non-triangle", tri.triangle(3, 4, 7));
        assertEquals("equilateral", tri.triangle(5, 5, 5));
        assertEquals("isosceles", tri.triangle(7, 4, 4));
        assertEquals("scalene", tri.triangle(2, 3, 4));
    }
}