package com.adaptor.object;

import com.adaptor.claz.Source;
import com.adaptor.claz.Targetable;

/**
 * 对象适配器
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}