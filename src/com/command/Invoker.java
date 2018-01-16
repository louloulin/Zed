package com.command;

/**
 * @author lin
 * 司令调用命令
 */
public class Invoker {
      
    private Command command;  
      
    public Invoker(Command command) {  
        this.command = command;  
    }  
  
    public void action(){  
        command.exe();  
    }  
}  