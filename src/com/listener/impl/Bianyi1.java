package com.listener.impl;

import com.listener.Observer;

/**
 * 便衣警察邹宇
 */
public class Bianyi1 implements Observer {
    /**
     * 警察名称
     */
    private String bname = "邹宇";

    @Override
    public void update(String message, String name) {
        System.out.println(bname + ":" + name + "那里有新情况：" + message);
    }
}
 

 
