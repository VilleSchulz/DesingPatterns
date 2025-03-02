package tiles;

import graphics.TileTexture;
import javafx.scene.image.Image;

public class RoadTile extends Tile {
    String description = "road";
    private final Image texture;

    public RoadTile(TileTexture tileTexture) {
        this.texture = tileTexture.getImage();


    }
    @Override
    public Image getTexture(){
         return this.texture;
   }

    @Override
    String getDescription() {
        return description;
    }


}
