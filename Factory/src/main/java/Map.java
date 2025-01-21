abstract class Map {
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

    public void display() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(tiles[i][j].getCharacter());

            }
            System.out.println();
        }

    }

    protected abstract Tile createTile();


}
