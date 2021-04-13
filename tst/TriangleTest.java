import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TriangleTest {

    @Test
    public void isTriangleTest() throws Throwable{

        //given
        Triangle A = new Triangle(4,2,3);
        Triangle B = new Triangle(2,2,5);

        //then
        assertTrue(A.isTriangle());
        assertFalse(B.isTriangle());

    }

    @Test
    public void isEqualateralTest() throws Throwable{

        //given
        Triangle A = new Triangle(2,2,2);
        Triangle B = new Triangle(2,2,3);

        //then
        assertTrue(A.isEquilateral());
        assertFalse(B.isEquilateral());
    }

    @Test
    public void isIsoscelesTest() throws Throwable{

        //given
        Triangle A = new Triangle(2,1,2);
        Triangle B = new Triangle(2,2,1);
        Triangle C = new Triangle(4,2,3);

        //then
        assertTrue(A.isIsosceles());
        assertTrue(B.isIsosceles());
        assertFalse(C.isIsosceles());
    }

    @Test
    public void isScaleneTest() throws Throwable{

        //given
        Triangle A = new Triangle(2,4,3);
        Triangle B = new Triangle(3,2,2);

        //then
        assertTrue(A.isScalene());
        assertFalse(B.isScalene());
    }

}
