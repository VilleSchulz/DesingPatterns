package main.java;

public class CityMap extends Map {
    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        int random = (int) (Math.random() * 3);

        return switch (random) {
            case 0 -> new RoadTile();
            case 1 -> new ForestTile();
            case 2 -> new BuildingTile();
            default -> throw new IllegalStateException("Unexpected value: " + random);
        };

    }
}
