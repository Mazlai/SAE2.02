package test.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import main.java.eraser.Eraser;

public class EraserTest {
    @Test
    public void testSolutionErase1() {
        assertEquals("666,thenumberofthebeast", Eraser.erase("666, the number of the beast"));
        assertEquals("06   07651970", Eraser.erase("06   07 65 19 70 "));
        assertEquals("OK", Eraser.erase("OK"));
        assertEquals("Coucou  JM  B", Eraser.erase("Cou cou  J M  B"));
        assertEquals("", Eraser.erase(""));
    }
    
}