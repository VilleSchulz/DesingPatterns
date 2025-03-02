package maps;

import graphics.TileTexture;
import tiles.*;


public class WildernessMap extends Map {
    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        int random = (int) (Math.random() * 3);

        return switch (random) {
            case 0 -> new SwampTile(TileGraphicFactory.getTileGraphic(TileType.SWAMP));
            case 1 -> new WaterTile(TileGraphicFactory.getTileGraphic(TileType.WATER));
            case 2 -> new ForestTile(TileGraphicFactory.getTileGraphic(TileType.FOREST));
            default -> throw new IllegalStateException("Unexpected value: " + random);
        };


    }


}
