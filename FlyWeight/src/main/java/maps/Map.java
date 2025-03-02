package maps;

import javafx.scene.image.Image;
import tiles.Tile;

public abstract class Map {
    protected int width;
    protected int height;
    protected Tile[][] tiles;


    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new Tile[width][height];
        generateMap();

    }

    public Map generateMap() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                tiles[i][j] = createTile();
            }
        }
        return this;


    }

    public Image getTileImage(int x, int y) {
        return tiles[x][y].getTexture();

    }




    protected abstract Tile createTile();


}
