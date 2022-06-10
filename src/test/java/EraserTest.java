import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import eraser.Eraser;
import eraser.Eraser2;

public class EraserTest {
    @Test
    public void testSolution() {
        assertEquals("666,thenumberofthebeast", Eraser.erase("666, the number of the beast"));
        assertEquals("06   07651970", Eraser.erase("06   07 65 19 70 "));
        assertEquals("OK", Eraser.erase("OK"));
        assertEquals("Coucou  JM  B", Eraser.erase("Cou cou  J M  B"));
        assertEquals("", Eraser.erase(""));
        
        assertEquals("666,thenumberofthebeast", Eraser2.erase("666, the number of the beast"));
        assertEquals("06   07651970", Eraser2.erase("06   07 65 19 70 "));
        assertEquals("OK", Eraser2.erase("OK"));
        assertEquals("Coucou  JM  B", Eraser2.erase("Cou cou  J M  B"));
        assertEquals("", Eraser2.erase(""));
    }
}
