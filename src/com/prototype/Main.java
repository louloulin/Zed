/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.prototype;

/**
 * 类名称: Main <br>
 * 类描述: <br>
 *
 * @author: chong.lin
 * @date: 2018/1/16 下午4:34
 * @company: 易宝支付(YeePay)
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        System.out.println(prototype);
        Prototype prototype1  = (Prototype) prototype.clone();
        System.out.println(prototype1);
    }
}