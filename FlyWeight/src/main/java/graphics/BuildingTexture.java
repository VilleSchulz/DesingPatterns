package graphics;

import javafx.scene.image.Image;

public class BuildingTexture implements TileTexture {

    private Image image = new Image(getClass().getResource("/building.png").toExternalForm());

    public Image getImage() {
        return image;
    }
}
