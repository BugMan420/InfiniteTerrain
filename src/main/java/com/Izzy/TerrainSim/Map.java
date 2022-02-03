package com.Izzy.TerrainSim;



public class Map {
    Room NewWorld[][] = new Room [4][4];

    public void NewWorld(){
        for(int i=0; i<NewWorld.length;i++){
            for(int j=0; j<NewWorld.length;j++){
                NewWorld[i][j]=Room.emptyRoom;
            }
            NewWorld[0][0] = Room.startingRoom;
            NewWorld[3][3] = Room.treasureRoom;
        }
    }
}
