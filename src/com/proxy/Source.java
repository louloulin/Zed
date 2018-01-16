package com.proxy;

/**
 * @author lin
 * 源方法
 */
public class Source implements Sourceable {
  
    @Override  
    public void method() {  
        System.out.println("the original method!");  
    }  
} 