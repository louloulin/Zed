/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.adaptor.interfa;

/**
 * 类名称: Wrapper <br>
 * 类描述: <br>
 * 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
 * <p>
 * 对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
 * <p>
 * 接口的适配器模式：当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
 *
 * @author: chong.lin
 * @date: 2018/1/16 下午4:56
 * @company: 易宝支付(YeePay)
 */
public abstract class Wrapper implements Sourceable {
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}