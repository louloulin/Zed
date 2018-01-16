package com.visitor;

/**
 *@author lin
 * 测试类
 */
public class Test {
  
    public static void main(String[] args) {  
        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();  
        sub.accept(visitor);      
    }  
}  