package com.visitor;

/**
 * @author lin
 * 数据接口
 */
public class MySubject implements Subject {
  
    @Override  
    public void accept(Visitor visitor) {  
        visitor.visit(this);  
    }  
  
    @Override  
    public String getSubject() {  
        return "love";  
    }  
}  
