/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.factory.ordinary;

import com.factory.ordinary.impl.EmailSender;
import com.factory.ordinary.impl.WechatSender;

/**
 * 类名称: OrdinaryFactory <br>
 * 类描述:普通工厂模式 <br>
 *
 * @author: chong.lin
 * @date: 2018/1/16 下午3:44
 * @company: 易宝支付(YeePay)
 */
public class OrdinaryFactory {
    /**
     * 创建发送者对象
     *
     * @return sender
     */
    public static Sender create(final String type) {
        Sender sender = null;
        switch (type) {
            case "email":
                sender = new EmailSender();
                break;
            case "wechat":
                sender = new WechatSender();
                break;
            default:
                sender = new Sender() {
                    @Override
                    public void send() {
                        System.out.println("发送" + type);
                    }
                };
                break;
        }
        return sender;
    }
}