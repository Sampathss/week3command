package com.lewis.assignments.doorknobcommanddesign;

public class DoorCloseCommand implements Command{
    Door door;
    public DoorCloseCommand(Door door){
        this.door = door;
    }
    public void execute(){
        door.Close();
    }
}