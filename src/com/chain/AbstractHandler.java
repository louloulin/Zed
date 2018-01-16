package com.chain;

/**
 * @author lin
 */
public abstract class AbstractHandler {
      
    private Handler handler;  
  
    public Handler getHandler() {  
        return handler;  
    }  
  
    public void setHandler(Handler handler) {  
        this.handler = handler;  
    }  
      
}  