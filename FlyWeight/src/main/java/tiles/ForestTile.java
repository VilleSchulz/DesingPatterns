package tiles;


import graphics.TileTexture;
import javafx.scene.image.Image;

public class ForestTile extends Tile {
    String description = "forest";
    private final Image texture;

    public ForestTile(TileTexture texture) {
        this.texture = texture.getImage();
    }


    public String getDescription() {
        return description;
    }


    @Override
    public Image getTexture() {
        return texture;
    }
}
