/**
 * Copyright: Copyright (c)
 * Company: 易宝支付(YeePay)
 */
package com.singleton;

/**
 * 类名称: Singleton <br>
 * 类描述:单例模式 <br>
 *
 * @author: chong.lin
 * @date: 2018/1/16 下午4:09
 * @company: 易宝支付(YeePay)
 */
public class Singleton {

    /**
     * 私有构造方法，防止被实例化
     */
    private Singleton() {
    }

    /**
     * 内部类单例模式
     */
    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

    /**
     * 创建单例
     *
     * @return
     */
    public static Singleton getInstance1() {
        return SingletonFactory.instance;
    }

    /**
     * 双重检查单例
     */
    private volatile static Singleton singleton = null;

    /**
     * 双重检查单例创建
     * @return
     */
    public static Singleton getInstance2() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}