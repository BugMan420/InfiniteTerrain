package com.Izzy.TerrainSim;

public class Player {
    public static int currentXAxis = 0;
    public static int currentYAxis = 0;
    public static String name = "TestDummy";

    public static Void newPlayer() {
        getCurrentXAxis();
        getCurrentYAxis();
        System.out.print(name);
        return null;
    }

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

    public static void moveNorth(){
        Player.currentYAxis = currentYAxis+1;
        if (Player.currentYAxis > 3){
            Player.currentYAxis = 0;
        }
    }

    public static void moveSouth(){
        Player.currentYAxis = currentYAxis-1;
        if (Player.currentYAxis < 0){
            Player.currentYAxis = 3;
        }
    }

    public static void moveEast(){
        Player.currentXAxis = currentXAxis+1;
        if (Player.currentXAxis > 3){
            Player.currentXAxis = 0;
        }
    }

    public static void moveWest(){
        Player.currentXAxis = currentXAxis-1;
        if (Player.currentXAxis < 0){
            Player.currentXAxis = 3;
        }
    }



}
