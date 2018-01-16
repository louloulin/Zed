/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.factory.ordinary.impl;

import com.factory.ordinary.Sender;

/**
 * 类名称: WechatSender <br>
 * 类描述: <br>
 *
 * @author: chong.lin
 * @date: 2018/1/16 下午3:51
 * @company: 易宝支付(YeePay)
 */
public class WechatSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送微信信息");
    }
}