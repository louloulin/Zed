package com.interpreter;

/**
 * @author lin
 * 解释器模式测试类
 */
public class Test {
  
    public static void main(String[] args) {  
        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus()  
                .interpret(new Context(9, 2)), 8)));  
        System.out.println(result);  
    }  
} 