/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.bulider;

/**
 * 类名称: Main <br>
 * 类描述:建造者模式<br>
 *
 * @author: chong.lin
 * @date: 2018/1/16 下午4:30
 * @company: 易宝支付(YeePay)
 */
public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
        System.out.println(builder.getList());
    }
}