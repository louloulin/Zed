package com.bridge;

/**
 * @author lin
 * 源的不同实现2
 */
public class SourceSub2 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }
}