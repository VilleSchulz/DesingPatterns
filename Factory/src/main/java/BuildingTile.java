package main.java;

public class BuildingTile extends Tile {
    String description = "building";
    String character = " B ";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getCharacter() {
        return character;
    }


}
