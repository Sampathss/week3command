package com.lewis.assignments.doorknobcommanddesign;

public class DoorOpenCommand implements Command{
    Door door;
    public DoorOpenCommand(Door door){
        this.door = door;
    }
    public void execute(){
        door.Open();
    }
}

