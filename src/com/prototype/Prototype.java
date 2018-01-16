package com.prototype;

/**
 *原型模式
 */
public class Prototype implements Cloneable {
  
    @Override
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();  
        return proto;  
    }  
}  