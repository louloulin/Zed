package com.listener.impl;

import com.listener.Badass;
import com.listener.Observer;

import java.util.ArrayList;
import java.util.List;


/**
 * 嫌犯大熊
 */
public class XianFan2 implements Badass {
    /**
     * 别称
     */
    private String name = "小熊";
    /**
     * 定义观察者集合
     */
    private List<Observer> observerList = new ArrayList<Observer>();

    /**
     * 增加观察者
     *
     * @param observer
     */
    @Override
    public void addObserver(Observer observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        if (observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    /**
     * 通知观察者
     *
     * @param message
     */
    @Override
    public void notice(String message) {
        for (Observer observer : observerList) {
            observer.update(message, name);
        }
    }
}