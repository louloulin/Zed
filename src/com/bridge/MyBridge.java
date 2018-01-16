package com.bridge;

/**
 * @author lin
 * 这样，就通过对Bridge类的调用，实现了对接口Sourceable的实现类SourceSub1和SourceSub2的调用。接下来我再画个图，
 * 大家就应该明白了，因为这个图是我们JDBC连接的原理，有数据库学习基础的，一结合就都懂了。
 */
public class MyBridge extends Bridge {
    @Override
    public void method(){
        getSource().method();  
    }  
} 