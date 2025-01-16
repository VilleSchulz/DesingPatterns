
package main.java;
public class WaterTile extends Tile {

    String description = "water";
    String character = " W ";
    @Override

    public String getDescription(){
        return description;
    }

    @Override
    public String getCharacter(){
        return character;
    }
}
