package com.Izzy.TerrainSim;

public class Player {
    public static int currentXAxis = 0;
    public static int currentYAxis = 0;
    public String name;

    public static int getCurrentXAxis() {
        return currentXAxis;
    }

    public static int getCurrentYAxis() {
        return currentYAxis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveNorth(){
        Player.currentYAxis = currentYAxis+1;
        if (Player.currentYAxis > 3){
            Player.currentYAxis = 0;
        }
    }

    public void moveSouth(){
        Player.currentYAxis = currentYAxis-1;
        if (Player.currentYAxis < 0){
            Player.currentYAxis = 3;
        }
    }

    public void moveEast(){
        Player.currentXAxis = currentXAxis+1;
        if (Player.currentXAxis > 3){
            Player.currentXAxis = 0;
        }
    }

    public void moveWest(){
        Player.currentXAxis = currentXAxis-1;
        if (Player.currentXAxis < 0){
            Player.currentXAxis = 3;
        }
    }



}
