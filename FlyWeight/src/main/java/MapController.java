import maps.CityMap;
import maps.Map;
import maps.WildernessMap;
import tiles.Tile;

public class MapController {
    private  int gridWidth;
    private  int gridHeight;
    private final int TILE_SIZE = 40;
    private Game game;


    public MapController(int gridWidth, int gridHeight) {
        this.gridWidth = gridWidth;
        this.gridHeight = gridHeight;
        this.game = new Game();



    }



    public int getGridWidth() {
        return gridWidth;
    }


    public int getGridHeight() {
        return gridHeight;
    }

    public int getTileSize() {
        return TILE_SIZE;
    }

    public Map createWilderness() {
        Map map = game.createmap(new WildernessMap(gridWidth, gridHeight));
        return map;



    }


    public Map createCity() {
        Map map = game.createmap(new CityMap(gridWidth, gridHeight));

        return map;


    }

}
