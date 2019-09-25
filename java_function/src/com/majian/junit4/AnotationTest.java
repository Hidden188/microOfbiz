package com.majian.junit4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnotationTest {

    /**
     * @Test方法可以提供处理异常
     *  @Test(excepted=XX.class)
     *  @Test(timeout=毫秒)
     * @Ignore忽略测试
     * @RunWith可以更改测试运行器，继承org.junit.runner.Runner
     * @Assert
     *  
     * @author Ma.jian
     */
    @Test(expected=ArithmeticException.class)
    public void testDivide() {
        assertEquals(2, new CalCulate().divide(4, 0));
    }
    
    @Ignore("")
    @Test(timeout=3000)
    public void testWhile() {
        while(true) {
            System.out.println("runing...");
        }
    }
    
    @Test(timeout=3000)
    public void testReadFile() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
