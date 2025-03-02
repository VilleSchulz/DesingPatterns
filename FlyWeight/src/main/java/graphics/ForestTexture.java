package graphics;

import javafx.scene.image.Image;

public class ForestTexture implements TileTexture {

    private Image image = new Image(getClass().getResource("/forest.png").toExternalForm());

    public Image getImage() {
        return image;
    }
}
