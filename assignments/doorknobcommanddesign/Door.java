package com.lewis.assignments.doorknobcommanddesign;

public class Door {
	
	public boolean open;
    public void Open(){
        open = true;
        System.out.println("DoorKnob is Opened");
    }
    public void Close(){
        open = false;
        System.out.println("DoorKnob is Closed");
    }
}
