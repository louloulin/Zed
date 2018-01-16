package com.bulider;

import com.factory.ordinary.Sender;
import com.factory.ordinary.impl.EmailSender;
import com.factory.ordinary.impl.WechatSender;

import java.util.ArrayList;
import java.util.List;

public class Builder {
      
    private List<Sender> list = new ArrayList<Sender>();
      
    public void produceMailSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new EmailSender());
        }  
    }  
      
    public void produceSmsSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new WechatSender());
        }  
    }

    public List<Sender> getList() {
        return list;
    }

}