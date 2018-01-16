package com.visitor;

/**
 * @author lin
 * 算法实现
 */
public class MyVisitor implements Visitor {
  
    @Override  
    public void visit(Subject sub) {  
        System.out.println("visit the subject："+sub.getSubject());  
    }  
}  