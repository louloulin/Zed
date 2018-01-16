package com.facade;

/**
 * @author lin
 * 外观模式的目标对象之一
 */
public class CPU {
      
    public void startup(){  
        System.out.println("cpu startup!");  
    }  
      
    public void shutdown(){  
        System.out.println("cpu shutdown!");  
    }  
}  