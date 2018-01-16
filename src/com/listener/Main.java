/**
 * Copyright: Copyright (c)
 * Company: 易宝支付(YeePay)
 */
package com.listener;

import com.listener.impl.*;

/**
 * 类名称: Main <br>
 * 类描述: <br>
 *
 * @author: chong.lin
 * @date: // 上午:
 * @company: 易宝支付(YeePay)
 */
public class Main {
    public static void main(String[] args) {
        //定义两个嫌犯
        Badass xf1 = new XianFan1();
        Badass xf2 = new XianFan2();
        //定义三个观察便衣警察
        Observer o1 = new Bianyi1();
        Observer o2 = new Bianyi2();
        Observer o3 = new Bianyi3();
        //为嫌犯增加观察便衣
        xf1.addObserver(o1);
        xf1.addObserver(o2);
        xf2.addObserver(o1);
        xf2.addObserver(o2);
        //定义嫌犯的情况
        String message1 = "光头强的面包到了";
        String message2 = "光头强要来砍树了";
        xf1.notice(message1);
        xf2.notice(message2);

    }
}