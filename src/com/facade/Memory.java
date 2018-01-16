package com.facade;

/**
 * @author lin
 * 外观模式的目标对象之一
 */
public class Memory {
      
    public void startup(){  
        System.out.println("memory startup!");  
    }  
      
    public void shutdown(){  
        System.out.println("memory shutdown!");  
    }  
}  