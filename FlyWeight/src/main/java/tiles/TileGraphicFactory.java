package tiles;

import graphics.*;

import java.util.HashMap;

public class TileGraphicFactory {

    private static final HashMap<TileType, TileTexture> tileGraphics = new HashMap<>();

// getTileGraphic is a factory method that creates a new object of a specific type
    public static TileTexture getTileGraphic(TileType terrainType) {
        if (!tileGraphics.containsKey(terrainType)) {
            TileTexture texture = loadImageObject(terrainType);
            tileGraphics.put(terrainType, texture);
        }
        return tileGraphics.get(terrainType);
    }


    // loadImageObject is a factory method that creates a new object of a specific type
    private static TileTexture loadImageObject(TileType terrainType) {

        return switch (terrainType) {
            case WATER -> new WaterTexture();
            case FOREST -> new ForestTexture();
            case SWAMP -> new SwampTexture();
            case BUILDING -> new BuildingTexture();
            case ROAD -> new RoadTexture();
        };
    }


}
