/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.factory.ordinary.impl;

import com.factory.ordinary.Sender;

/**
 * 类名称: EmailSender <br>
 * 类描述:邮件发送者 <br>
 *
 * @author: chong.lin
 * @date: 2018/1/16 下午3:50
 * @company: 易宝支付(YeePay)
 */
public class EmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送邮件信息");
    }
}