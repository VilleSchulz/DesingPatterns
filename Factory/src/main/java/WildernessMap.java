package main.java;

public class WildernessMap extends Map {
    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        int random = (int) (Math.random() * 3);

        return switch (random) {
            case 0 -> new SwampTile();
            case 1 -> new WaterTile();
            case 2 -> new ForestTile();
            default -> throw new IllegalStateException("Unexpected value: " + random);
        };


    }


}
