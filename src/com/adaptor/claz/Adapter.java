package com.adaptor.claz;

import com.adaptor.claz.Source;
import com.adaptor.claz.Targetable;

/**
 * 适配器类(类适配器）
 */
public class Adapter extends Source implements Targetable {
  
    @Override  
    public void method2() {  
        System.out.println("this is the targetable method!");  
    }  
}  