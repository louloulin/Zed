/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.factory.multiFactory;

import com.factory.ordinary.Sender;
import com.factory.ordinary.impl.EmailSender;
import com.factory.ordinary.impl.WechatSender;

/**
 * 类名称: MultiFactory <br>
 * 类描述: 多个工厂方法模式<br>
 *
 * @author: chong.lin
 * @date: 2018/1/16 下午3:59
 * @company: 易宝支付(YeePay)
 */
public class MultiFactory {
    public static Sender produceEamil(){
        return new  EmailSender();
    }
    public static Sender produceWechat(){
        return new WechatSender();
    }
}