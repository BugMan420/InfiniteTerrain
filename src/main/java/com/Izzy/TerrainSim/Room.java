package com.Izzy.TerrainSim;

public class Room {
    private String description;
    private String roomName;

    public Room (String name, String desc){
        this.description = desc;
        this.roomName = name;
    }

    static Room startingRoom = new Room("Starting Room","A dimly lit room with four doors in each direction."){};
    Room emptyRoom = new Room ("Empty Room", "A room with nothing remarkable.");
    Room treasureRoom = new Room ("Treasure Room", "A room with the treasure in it.");
}
