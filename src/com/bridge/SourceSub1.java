package com.bridge;

/**
 * @author lin
 * 源的不同实现1
 */
public class SourceSub1 implements Sourceable {
  
    @Override  
    public void method() {  
        System.out.println("this is the first sub!");  
    }  
}  
