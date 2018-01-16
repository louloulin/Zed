package com.listener;

/**
 * 观察者模式接口
 * @author lin
 * @date 2018-01-16
 */
public interface Observer {
    /**
     * 观察触发
     * @param message
     * @param name
     */
    void update(String message,String name);
 }