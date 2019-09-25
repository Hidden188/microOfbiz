package com.test;

public class TestMain {

    /**
     * @param args
     * @author Ma.jian
     */
    public static void main(String[] args) {
        //stMe();
        /**
         * 修饰符
         * *******   当前类   pack子类         其他package
         * public:   是           是       是                 是
         * protected：是          是       是                 否
         * default：      是         是       否                 否
         * private：      是         否       否                 否
         */
        
        int i = 3;
        System.out.println(Integer.compare(4, 8));
        System.out.println(Integer.bitCount(1000));
        System.out.println(Math.random());
        //getE();
        
    }
    
    static void stMe () {
        System.out.println("static");
        TestMain tm = new TestMain();
        tm.notStMe();
    }
    
    public void notStMe() {
        System.out.println("notStatic");
        stMe();
    }
    
    public static void getE() {
        // 方法1
        double e = 1.0;
        double t = 1.0;
        for (int i = 1; i <= 30; i++) {
            t /= i;
            e += t;
        }
        System.out.println(e);
        // 方法2，可惜我没看懂，很精妙
        e = 0.0;
        for (int i = 20; i > 0; i--) {
            e = (e + 1.0) / i;
        }
        e++;
        System.out.println(e);
    }
}
