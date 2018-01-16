package com.interpreter;

/**
 *@author lin
 * 表达的实现1
 */
public class Plus implements Expression {
  
    @Override  
    public int interpret(Context context) {  
        return context.getNum1()+context.getNum2();  
    }  
}  
