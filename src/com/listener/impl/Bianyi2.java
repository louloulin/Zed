package com.listener.impl;

import com.listener.Observer;

/**
  * 便衣警察石破天
  */
 public class Bianyi2 implements Observer {
     //定义姓名
     private String bname = "石破天";
     @Override
     public void update(String message,String name) {
         System.out.println(bname+":"+name+"那里有新情况："+ message);
     }
 }