package main.java;

public class SwampTile extends Tile {
    String description = "swamp";
    String character = " S ";

    @Override

    public String getDescription() {
        return description;
    }

    @Override
    public String getCharacter() {
        return character;
    }

}
