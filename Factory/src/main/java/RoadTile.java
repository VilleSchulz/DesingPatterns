package main.java;

public class RoadTile extends Tile {
    String description = "road";
    String character = " R ";


    public String getDescription(){
        return description;
    }

    @Override
    public String getCharacter(){
        return character;
    }
}
