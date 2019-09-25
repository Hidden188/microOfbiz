package com.majian.junit4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ErrorAndFailureTest {

    /**
     * 1.failure表示实际结果和预期结果不一样引起的
     * 2.error表示代码的错误，也可以是bug
     * 
     * @author Ma.jian
     */
    
    @Test
    public void testAdd() {
        assertEquals(9, new CalCulate().add(3, 3));
    }
    
    @Test
    public void testDeivde() {
        assertEquals(6, new CalCulate().divide(2, 0));
    }

}
