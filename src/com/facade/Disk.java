package com.facade;

/**
 * @author lin
 * 外观模式的目标对象之一
 */
public class Disk {

    public void startup() {
        System.out.println("disk startup!");
    }

    public void shutdown() {
        System.out.println("disk shutdown!");
    }
}  