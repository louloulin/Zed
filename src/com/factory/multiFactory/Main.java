/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.factory.multiFactory;

import com.factory.ordinary.OrdinaryFactory;
import com.factory.ordinary.Sender;

/**
 * 类名称: Main <br>
 * 类描述:静态工厂方法模式 <br>
 *
 * @author: chong.lin
 * @date: 2018/1/16 下午3:57
 * @company: 易宝支付(YeePay)
 */
public class Main {
    public static void main(String[] args) {
       Sender sender = MultiFactory.produceEamil();
       sender.send();
    }
}