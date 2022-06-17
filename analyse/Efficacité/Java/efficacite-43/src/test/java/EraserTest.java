package test.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import main.java.eraser.Eraser;

public class EraserTest {
    @Test
    public void testSolutionErase1() {
        assertEquals("666,thenumberofthebeast", Eraser.erase2("666, the number of the beast"));
        assertEquals("06   07651970", Eraser.erase2("06   07 65 19 70 "));
        assertEquals("OK", Eraser.erase2("OK"));
        assertEquals("Coucou  JM  B", Eraser.erase2("Cou cou  J M  B"));
        assertEquals("", Eraser.erase2(""));
    }
    
}