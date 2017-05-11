package junitTuts.tutsPointExample;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by roberto on 11/05/17.
 */
public class TestJunit {
    @Test

    public void testAdd() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }
}