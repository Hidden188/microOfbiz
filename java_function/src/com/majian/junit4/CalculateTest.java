package com.majian.junit4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest {

    /**
     * 1.测试方法必须使用@Test修饰
     * 2.测试方法必须使用public void修饰，不能有任何参数
     * 3.新建一个源码项目来存放我们的测试代码
     * 4.测试包名和被测试包名必须一致
     * 5.测试单元中的每个方法必须可以独立测试，测试方法间不能有任何依赖
     * 6.测试类使用test作为类名后缀
     * 7.测试类使用Test作为方法名后缀
     * 
     * @author Ma.jian
     */
    
    @Test
    public void testAdd() {
        assertEquals(6, new CalCulate().add(3, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(0, new CalCulate().subtract(3, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(9, new CalCulate().multiply(3, 3));
    } 
    
    @Test
    public void testDivied() {
        assertEquals(1, new CalCulate().divide(2, 2));
    }
    
}
