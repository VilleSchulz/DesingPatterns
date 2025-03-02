package graphics;

import javafx.scene.image.Image;
import tiles.Tile;

public class WaterTexture implements TileTexture {

    private Image image = new Image(getClass().getResource("/water.png").toExternalForm());

    public Image getImage() {
        return image;
    }
}
