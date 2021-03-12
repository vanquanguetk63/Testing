import org.junit.Test;
import static org.junit.Assert.*;

public class MyTest {
    @Test
    public void testMyProgram() {
        Object A = new Object(3, 4);
        Object B = new Object(3, 4);
        Object C = new Object(3,4 );
        String check = Program.myProgram(A, B, C);
        assertEquals(Util.ERROR_INPUT, check);
    }
}
