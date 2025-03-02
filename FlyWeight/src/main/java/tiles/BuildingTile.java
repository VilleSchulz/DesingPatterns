package tiles;


import graphics.TileTexture;
import javafx.scene.image.Image;

public class BuildingTile extends Tile {

   private final Image texture;

    String description = "building";
    public BuildingTile(TileTexture texture) {
        this.texture = texture.getImage();
    }

    @Override
    public String getDescription() {
        return description;
    }



    @Override
    public Image getTexture() {
        return texture;
    }


}
