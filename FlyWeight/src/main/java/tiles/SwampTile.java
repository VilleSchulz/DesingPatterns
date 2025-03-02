package tiles;

import graphics.TileTexture;
import javafx.scene.image.Image;


public class SwampTile extends Tile {
    String description = "swamp";
    private final Image texture;

    public SwampTile(TileTexture texture) {
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
