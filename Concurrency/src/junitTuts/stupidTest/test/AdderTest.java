package junitTuts.stupidTest.test;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by roberto on 11/05/17.
 */
public class AdderTest{

    private int firstAddend;
    private int secondAddend;

    public int getFirstAddend() {
        return firstAddend;
    }

    public void setFirstAddend(int firstAddend) {
        this.firstAddend = firstAddend;
    }

    public int getSecondAddend() {
        return secondAddend;
    }

    public void setSecondAddend(int secondAddend) {
        this.secondAddend = secondAddend;
    }

    @Before
    public void testPreparing(){
        this.firstAddend = 9;
        this.secondAddend=2;
    }


    @Test
    public void add(){
        int res = firstAddend + secondAddend;
        assertTrue(res==11);
    }


}


