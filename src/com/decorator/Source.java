package com.decorator;

/**
 * @author lin
 * 需要扩展对象
 */
public class Source implements Sourceable {
  
    @Override  
    public void method() {  
        System.out.println("the original method!");  
    }  
}  
