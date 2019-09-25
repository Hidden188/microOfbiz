package com.majian.junit4;

import static org.junit.Assert.*;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({JunitTest.class, CalCulateTest2.class})
public class SuitTest {

    /**
     * 1.测试套件就是组织测试类一起运行的
     *  测试套件的入口类，类里不能包含其他的方法
     *  更改测试运行器Suite.class
     *  将要测试的类作为数组传入到Suite.SuiteClass({})
     */
}
