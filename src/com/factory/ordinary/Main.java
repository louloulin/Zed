/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.factory.ordinary;

/**
 * 类名称: Main <br>
 * 类描述: <br>
 *
 * @author: chong.lin
 * @date: 2018/1/16 下午3:57
 * @company: 易宝支付(YeePay)
 */
public class Main {
    public static void main(String[] args) {
        Sender sender = OrdinaryFactory.create("email");
        sender.send();
        sender = OrdinaryFactory.create("alipay");
        sender.send();
    }
}