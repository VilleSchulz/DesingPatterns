package maps;

import tiles.BuildingTile;
import tiles.ForestTile;
import tiles.RoadTile;
import tiles.Tile;
import tiles.TileGraphicFactory;
import tiles.TileType;


public class CityMap extends Map {
    public CityMap(int width, int height) {
        super(width, height);
    }


    @Override
    protected Tile createTile() {
        int random = (int) (Math.random() * 3);

        return switch (random) {
            case 0 -> new RoadTile(TileGraphicFactory.getTileGraphic(TileType.ROAD));
            case 1 -> new ForestTile(TileGraphicFactory.getTileGraphic(TileType.FOREST));
            case 2 -> new BuildingTile(TileGraphicFactory.getTileGraphic(TileType.BUILDING));
            default -> throw new IllegalStateException("Unexpected value: " + random);
        };

    }
}
