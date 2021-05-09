import org.junit.Test;
import static org.junit.Assert.*;

public class MyTest {
    @Test
    public void testMyProgram() {
        Object A = new Object(0, 0, "A");
        Object B = new Object(0, 0, "B");
        Object C = new Object(1, 0, "C");
        String check = Program.myProgram(A, B, C);
        assertEquals(Util.getStringCenter(C, A, B), check);
    }

    @Test
    public void testMyProgram2() {
        Object A = new Object(-10001, 0, "A");
        Object B = new Object(0, 0, "B");
        Object C = new Object(0, 0, "C");
        String check = Program.myProgram(A, B, C);
        assertEquals(Util.ERROR_INPUT, check);
    }

    @Test
    public void testMyProgram3() {
        Object A = new Object(-10000, 0, "A");
        Object B = new Object(0, 0, "B");
        Object C = new Object(0, 0, "C");
        String check = Program.myProgram(A, B, C);
        assertEquals(Util.STRAIGHT, check);
    }

    @Test
    public void testMyProgram4() {
        Object A = new Object(10000, 0, "A");
        Object B = new Object(0, 0, "B");
        Object C = new Object(0, 0, "C");
        String check = Program.myProgram(A, B, C);
        assertEquals(Util.RIGHT_TRIANGLE, check);
    }

    @Test
    public void testMyProgram5() {
        Object A = new Object(-1, 1, "A");
        Object B = new Object(2, 4, "B");
        Object C = new Object(6, 0, "C");
        String check = Program.myProgram(A, B, C);
        assertEquals(Util.RIGHT_TRIANGLE, check);
    }
    @Test
    public void testMyProgram6() {
        Object A = new Object(2 , 1, "A");
        Object B = new Object(7, 1, "B");
        Object C = new Object(4.5, 5.33, "C");
        String check = Program.myProgram(A, B, C);
        assertEquals(Util.EQUILATERAL_TRIANGLE, check);
    }

    @Test
    public void testMyProgram7() {
        Object A = new Object(-12 , -4, "A");
        Object B = new Object(-12, -10, "B");
        Object C = new Object(-6, -10, "C");
        String check = Program.myProgram(A, B, C);
        assertEquals(Util.RIGHT_ISOSCELES_TRIANGLE, check);
    }

    @Test
    public void testMyProgram8() {
        Object A = new Object(5 , 6, "A");
        Object B = new Object(-12, 7, "B");
        Object C = new Object(5, 10, "C");
        String check = Program.myProgram(A, B, C);
        assertEquals(Util.TRIANGLE, check);
    }
}
