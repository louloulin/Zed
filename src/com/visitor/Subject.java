package com.visitor;

/**
 * @author lin
 * 数据接口
 */
public interface Subject {
    public void accept(Visitor visitor);  
    public String getSubject();  
}  