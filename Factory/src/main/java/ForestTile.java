package main.java;
public class ForestTile extends Tile {
    String description = "forrest";
    String character = " F ";
    @Override

    public String getDescription(){
        return description;
    }

    @Override
    public String getCharacter(){
        return character;
    }
}
