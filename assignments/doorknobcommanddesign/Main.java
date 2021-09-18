package com.lewis.assignments.doorknobcommanddesign;

public class Main{
    public static void main(String []args){
    	RemoteControl control = new RemoteControl();
        Door door = new Door();
        Command doorsOpen = new DoorOpenCommand(door);
        Command doorsClose = new DoorCloseCommand(door);
        
        
        control.setCommand(doorsOpen);
        control.pressButton();
        
        control.setCommand(doorsClose);
        control.pressButton();
        
    }
}